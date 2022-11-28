package com.votacion.sistema.repositories;

import com.votacion.sistema.models.CentroVotacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroVotacionRepository extends JpaRepository<CentroVotacion, Integer> {
}
