package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Integer> {
}
