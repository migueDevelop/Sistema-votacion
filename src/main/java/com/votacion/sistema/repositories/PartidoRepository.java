package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends JpaRepository<Partido,Integer> {
}
