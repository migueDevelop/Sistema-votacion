package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Municipios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipiosRepository extends JpaRepository<Municipios, Integer> {
}
