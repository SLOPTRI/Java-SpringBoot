package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.service;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Autor;

import java.util.List;

public interface AutorServiceInterface {

    public List<Autor> obtenerAutores();
    public void crearAutor(int id, String nombre, int year);
    public void actualizarAutor(int id, String nombre,int year);
    public void borrarAutor(int id);

}
