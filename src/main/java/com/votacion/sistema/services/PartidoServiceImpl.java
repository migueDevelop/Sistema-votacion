package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.repositories.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoServiceImpl implements PartidoService{

    @Autowired
    private PartidoRepository partidoRepository;
    @Override
    public Partido getPartidoById(Integer id) {
        return partidoRepository.findById(id).get();
    }
    @Override
    public List<Partido> partidoList() {
        return partidoRepository.findAll();
    }
}
