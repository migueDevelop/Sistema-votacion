package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Papeleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PapeletaRepository extends JpaRepository<Papeleta, Integer> {
}
