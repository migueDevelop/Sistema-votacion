package com.votacion.sistema.controller;

import com.votacion.sistema.models.*;
import com.votacion.sistema.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VotacionController {

    @Autowired
    private CandidatoService candidatoService;
    @Autowired
    private PartidoService partidoService;
    @Autowired
    private VotoService votoService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PapeletaService papeletaService;

    @GetMapping("/votacion")
    public String listCandidatos(Model model){
        Usuario usuario = usuarioService.getCurrentUsuario();
        Papeleta papeleta = papeletaService.findPapeletaById(usuario.getPapeleta().getId_papeleta());
        if(papeleta.getVoto() != null){
            return "deniedAccess";
        }
        model.addAttribute("candidatos", candidatoService.candidatosList());
        return "candidatos";
    }

    @PostMapping("/votacion/{id}")
    public String saveVoto(@PathVariable Integer id){
        Candidato candidato = candidatoService.getCandidatoById(id);
        Partido partido = partidoService.getPartidoById(candidato.getId());
        Voto voto = votoService.saveVoto(partido);
        Usuario usuario = usuarioService.getCurrentUsuario();
        Papeleta papeleta = papeletaService.findPapeletaById(usuario.getPapeleta().getId_papeleta());
        papeletaService.saveIdVoto(papeleta, voto);

        return "redirect:/";
    }

    @PostMapping("/votacion")
    public String saveVotoNull(){
        Voto voto = votoService.saveVotoNull();
        Usuario usuario = usuarioService.getCurrentUsuario();
        Papeleta papeleta = papeletaService.findPapeletaById(usuario.getPapeleta().getId_papeleta());
        papeletaService.saveIdVoto(papeleta, voto);

        return "redirect:/";
    }
}
