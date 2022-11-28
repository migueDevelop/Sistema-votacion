package com.votacion.sistema.services;

import com.votacion.sistema.models.Papeleta;
import com.votacion.sistema.models.Voto;
import com.votacion.sistema.repositories.PapeletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PapeletaServiceImpl implements PapeletaService{

    @Autowired
    private PapeletaRepository papeletaRepository;

    @Override
    public void saveIdVoto(Papeleta papeleta, Voto voto) {
        papeleta.setVoto(voto);
        papeletaRepository.save(papeleta);
    }
    @Override
    public Papeleta findPapeletaById(Integer id) {
        return papeletaRepository.findById(id).get();
    }
}
