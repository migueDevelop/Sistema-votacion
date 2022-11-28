package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;
import com.votacion.sistema.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class VotoServiceImpl implements VotoService{
    @Autowired
    private VotoRepository votoRepository;
    @Override
    public Voto saveVoto(Partido partido) {
        LocalTime time = LocalTime.now();
        Voto voto = new Voto();
        voto.setHora(time);
        voto.setPartido(partido);
        votoRepository.save(voto);
        return voto;
    }

    @Override
    public Voto saveVotoNull() {
        LocalTime time = LocalTime.now();
        Voto voto = new Voto();
        voto.setHora(time);
        voto.setPartido(null);
        votoRepository.save(voto);
        return voto;
    }
}
