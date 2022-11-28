package com.votacion.sistema.services;

import com.votacion.sistema.models.Papeleta;
import com.votacion.sistema.models.Voto;

public interface PapeletaService {
    public void saveIdVoto(Papeleta papeleta, Voto voto);
    public Papeleta findPapeletaById(Integer id);
}
