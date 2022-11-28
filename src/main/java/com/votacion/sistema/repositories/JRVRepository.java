package com.votacion.sistema.repositories;

import com.votacion.sistema.models.JRV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JRVRepository extends JpaRepository<JRV,Integer> {
}
