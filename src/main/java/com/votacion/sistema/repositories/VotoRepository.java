package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Partido;
import com.votacion.sistema.models.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Integer> {
    List<Voto> findByPartido(Partido partido);
}
