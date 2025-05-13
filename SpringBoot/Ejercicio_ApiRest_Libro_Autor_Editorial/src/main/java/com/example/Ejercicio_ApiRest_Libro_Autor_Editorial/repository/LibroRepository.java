package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.repository;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
