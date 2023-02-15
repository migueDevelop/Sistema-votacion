package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;

import java.util.HashMap;

public interface VotoService {

    public Voto saveVoto(Partido partido);
    public Voto saveVotoNull();
    HashMap<String, Integer> getVotosByPartidoMapped();

    Integer getVotosNulos();
}
