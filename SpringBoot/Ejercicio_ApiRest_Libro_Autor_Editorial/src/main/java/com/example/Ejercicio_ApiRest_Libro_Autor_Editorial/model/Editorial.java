package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.controller.LibroController;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Editorial {

    @Id
    private Integer id;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "editorial")
    private List<Libro> libros = new ArrayList<>();

    public Editorial(int id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setId(int id){ this.id = id;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public void direccion(String direccion){ this.direccion = direccion;}

    public int getId(){ return this.id;}
    public String getNombre(){ return this.nombre;}
    public String getDireccion(){ return this.direccion;}

}
