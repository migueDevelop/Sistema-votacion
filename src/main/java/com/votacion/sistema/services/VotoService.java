package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;

public interface VotoService {

    public Voto saveVoto(Partido partido);
    public Voto saveVotoNull();
}
