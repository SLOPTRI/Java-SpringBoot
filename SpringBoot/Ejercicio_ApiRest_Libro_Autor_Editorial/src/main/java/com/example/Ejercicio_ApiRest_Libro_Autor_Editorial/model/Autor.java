package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Autor {

    @Id
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros = new ArrayList<>();

    public Autor(int id, String nombre, String apellido, String email){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public void setId(int id){ this.id = id;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setApellido(String apellido){ this.apellido = apellido;}
    public void setEmail(String email){ this.email = email;}

    public int getId(){ return this.id;}
    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}
    public String getEmail(){ return this.email;}

}
