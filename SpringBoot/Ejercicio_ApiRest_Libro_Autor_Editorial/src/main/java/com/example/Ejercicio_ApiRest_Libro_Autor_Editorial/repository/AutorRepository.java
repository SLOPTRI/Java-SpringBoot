package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.repository;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
