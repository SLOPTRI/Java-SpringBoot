package Producto;

public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String toString(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);

        return null;
    }
}

