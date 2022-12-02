package com.votacion.sistema.services;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;
import com.votacion.sistema.repositories.PartidoRepository;
import com.votacion.sistema.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

@Service
public class VotoServiceImpl implements VotoService{
    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private PartidoRepository partidoRepository;

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

    /*
    * Crea un diccionario de votos por partido de todos
    * los partidos
    * */
    @Override
    public HashMap<String, Integer> getVotosByPartidoMapped() {
        HashMap<String, Integer> votosPorPartido = new HashMap<>();

        // Para encontrar los nombres de los partidos
        List<Partido> partidoList = partidoRepository.findAll();

        for (Partido p: partidoList) {
            // Para encontrar los votos por partidos
            List<Voto> votoList = votoRepository.findByPartido(p);

            // Llave: Nombre del partido | Valor: Num de votos por ese partido
            votosPorPartido.put(p.getNombre(), votoList.size());

            // Deja la lista vacia
            votoList.clear();
        }

        return votosPorPartido;
    }

    /*
    Crea una lista de votos cuyo partido es null y devuelve su tamaño
    * */
    @Override
    public Integer getVotosNulos() {
        List<Voto> votosNulos = votoRepository.findByPartido(null);
        return votosNulos.size();
    }
}
