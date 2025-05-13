package Ejercicios1POO.Ejercicio_12;

public class Revista extends Publicacion{

    protected int num;

    public Revista(String isbn, String titulo, int pub_year, int num) {
        super(isbn, titulo, pub_year);
        this.num = num;
    }

}
