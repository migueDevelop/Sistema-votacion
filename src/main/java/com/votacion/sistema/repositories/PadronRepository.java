package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Padron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadronRepository extends JpaRepository<Padron, Integer> {
}
