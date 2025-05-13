package Ejercicios_Ficheros_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_1_Ficheros {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/ej.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
