package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Integer> {
}
