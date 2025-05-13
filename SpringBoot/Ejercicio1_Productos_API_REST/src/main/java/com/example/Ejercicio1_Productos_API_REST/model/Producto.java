package com.example.Ejercicio1_Productos_API_REST.model;

public class Producto {
    private String nombre;
    private double precio;
    private int id;

    public Producto(String nombre, double precio, int id){
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }
    public Producto(){}

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: "+getNombre()+"\n");
        sb.append("Precio: "+getPrecio()+"\n");
        sb.append("ID: "+getId()+"\n");

        return sb.toString();
    }
}
