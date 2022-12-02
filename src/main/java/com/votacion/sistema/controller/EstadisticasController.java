package com.votacion.sistema.controller;

import com.google.gson.JsonObject;
import com.votacion.sistema.models.Papeleta;
import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;
import com.votacion.sistema.services.PapeletaServiceImpl;
import com.votacion.sistema.services.PartidoServiceImpl;
import com.votacion.sistema.services.VotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class EstadisticasController {

    @Autowired
    private PartidoServiceImpl partidoService;

    @Autowired
    private VotoServiceImpl votoService;

    /*
    * Hace un JSON con la inforamcion para estadisticas:
    * partido: String, votos: String, color: String
    * */
    @CrossOrigin(origins = "http://localhost:8080/js/estadisticas.js")
    @RequestMapping(path = "/estadisticas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<String> getResultados() {
        // Crea un objto JSON
        JsonObject response = new JsonObject();
        // Diccionario de votos por partido
        HashMap<String, Integer> votoPorPartido = votoService.getVotosByPartidoMapped();

        for (Map.Entry<String, Integer> set: votoPorPartido.entrySet()) {
            response.addProperty(set.getKey(), set.getValue());
        }

        // Añade los votos nulos
        response.addProperty("nulos", votoService.getVotosNulos());

        String jsonResponse = response.toString();

        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    // Manda la pagina de resultados al index
    @GetMapping("/resultados")
    public String showResultados() { return "resultados"; }
}
