package com.votacion.sistema.services;

import com.votacion.sistema.models.Candidato;

import java.util.List;

public interface CandidatoService {
    public List<Candidato> candidatosList();

    public Candidato getCandidatoById(Integer id);
}
