package Ejercicios1POO.Ejercicio_12;

public class Libro extends Publicacion implements Prestable{
    protected boolean prestado;

    public Libro(String isbn, String titulo, int pub_year) {
        super(isbn,titulo,pub_year);
        this.prestado = false;
    }
    public void presta(){
        if(!this.prestado){
            this.prestado = true;
        }else if(this.prestado){
            System.out.println("Lo siento, ese libro ya esta prestado");
        }
    }
    public boolean estaPrestado(){
        return this.prestado;
    }
    public void devuelve(){
        this.prestado = false;
    }
    @Override
    public String toString(){
        StringBuilder amai = new StringBuilder();
        if(estaPrestado()){
            amai.append(super.toString()+" (prestado)");
        }else if(!estaPrestado()){
            amai.append(super.toString()+" (no prestado)");
        }
        return amai.toString();
    }
}
