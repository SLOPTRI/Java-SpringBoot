package Ejercicios1POO.Ejercicio_17;

public class Piramide {
    private int h;
    static int contador = 0;
    public Piramide(int h) {
        this.h = h;
        this.contador++;
    }
    public String toString() {
        StringBuilder indio = new StringBuilder();
        /*
        * Explicacion blucles for
        *
        * Primer for
        * Altura de la piramide usando la variable i
        *
        * Segundo for
        * Anade espacios a mi indio,
        * La primera vez i vale 0 por lo que anade espacios pero segun
        * incrementa la i anade menos espacios
        *
        * Tercer for
        * Anade los asteriscos
        * Primero 1,3,5,etc...
        * */
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < h - i -1; j++) {
                indio.append("  ");
            }
            for(int j = 0; j < 2*i + 1; j++) {
                indio.append(" *");
            }
            indio.append("\n");
















































        }
        return indio.toString();
    }
    public static int getPiramidesCreadas(){
        return contador;
    }
}
