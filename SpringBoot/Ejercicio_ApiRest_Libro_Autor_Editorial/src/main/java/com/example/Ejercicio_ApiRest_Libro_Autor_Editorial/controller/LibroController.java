package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.controller;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Libro;
import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    public LibroController(){

    }

    @GetMapping("/libros")
    public List<Libro> obtenerLibros(){
        return libroService.obtenerLibros();
    }

    @PostMapping("/crearLibro/{id}/{nombre}/{year}")
    public void crearLibro(@PathVariable int id, @PathVariable String nombre, @PathVariable int year){
        libroService.crearLibro(id,nombre,year);
    }

    @PutMapping("/actualizarLibro/{id}/{nombre}/{year}")
    public void actualizarLibro(@PathVariable int id, @PathVariable String nombre, @PathVariable int year){
        libroService.actualizarLibro(id,nombre,year);
    }

    @DeleteMapping("/borrarLibro/{id}")
    public void borrarLibro(@PathVariable int id){
        libroService.borrarLibro(id);
    }

}
