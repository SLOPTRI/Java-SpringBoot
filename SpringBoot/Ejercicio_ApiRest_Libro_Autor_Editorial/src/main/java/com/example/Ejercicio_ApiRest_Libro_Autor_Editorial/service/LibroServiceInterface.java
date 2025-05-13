package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.service;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Libro;

import java.util.List;

public interface LibroServiceInterface {

    public List<Libro> obtenerLibros();
    public void crearLibro(int id, String nombre, int year);
    public void actualizarLibro(int id, String nombre,int year);
    public void borrarLibro(int id);
    //public void indicarAutorEditorial(int idLibro, int idAutor, int idEditorial);
}
