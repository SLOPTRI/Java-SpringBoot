package Ejercicios1POO.Ejercicio_12;

public class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int pub_year;

    public Publicacion(String isbn, String titulo, int pub_year) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.pub_year = pub_year;
    }
    public String toString(){
        return "ISBN: "+this.isbn+", Titulo: "+this.titulo+", Año de publicación "+this.pub_year;
    }
}
