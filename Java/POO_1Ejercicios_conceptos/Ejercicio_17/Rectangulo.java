package Ejercicios1POO.Ejercicio_17;

public class Rectangulo {
    int b;
    int h;
    static int contador = 0;

    public Rectangulo(int b, int h) {
        this.b = b;
        this.h = h;
        contador++;
    }
    public String toString() {
        StringBuilder indio = new StringBuilder();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < b; j++){
                indio.append("* ");
            }
            indio.append("\n");
        }
        return indio.toString();
    }
    public static int getRectangulosCreados(){
        return contador;
    }
}
