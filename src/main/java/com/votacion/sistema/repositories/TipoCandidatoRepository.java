package com.votacion.sistema.repositories;

import com.votacion.sistema.models.TipoCandidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCandidatoRepository extends JpaRepository<TipoCandidato, Integer> {
}
