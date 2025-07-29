package com.example.primario.repositories;

import com.example.primario.entities.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Notas, Integer> {
}
