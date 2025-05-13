package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model;

import jakarta.persistence.*;

@Entity
public class Libro {

    @Id
    private Integer id;
    private String nombre;
    private int year;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "nombre_editorial")
    private Editorial editorial;

    public Libro(){

    }

    public Libro(int id, String nombre, int year){
        this.id = id;
        this.nombre = nombre;
        this.year = year;
    }

    public void setId(int id) { this.id = id;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setYear(int year){ this.year = year;}
    public void setAutor(Autor autor){ this.autor = autor;}
    public void setEditorial(Editorial editorial){ this.editorial = editorial;}

    public String getNombre() { return nombre;}
    public int getId() { return id;}
    public int getYear() { return year;}
    public Autor getAutor(){ return autor;}
    public Editorial getEditorial(){ return editorial;}
}
