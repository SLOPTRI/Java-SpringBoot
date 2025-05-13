import java.io.*;

public class Ejercicio_5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("resources/datos.txt"));
        String linea;
        int x = 0;
        String[] palabras;

        while((linea = reader.readLine()) != null){
            if((palabras = linea.split(" ")).length != 0){
              x += palabras.length;
            }
        }
        System.out.println("Numero de palabras: " + x);
        reader.close();
    }
}
