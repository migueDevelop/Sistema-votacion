package com.votacion.sistema.services;

import com.votacion.sistema.models.Candidato;
import com.votacion.sistema.repositories.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoServiceImpl implements CandidatoService{

    @Autowired
    private CandidatoRepository candidatoRepository;
    @Override
    public List<Candidato> candidatosList() {
        return candidatoRepository.findAll();
    }

    @Override
    public Candidato getCandidatoById(Integer id) {
        return candidatoRepository.findById(id).get();
    }


}
