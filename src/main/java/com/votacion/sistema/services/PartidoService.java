package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;

import java.util.List;

public interface PartidoService {

    Partido getPartidoById(Integer id);

    List<Partido> partidoList();
}
