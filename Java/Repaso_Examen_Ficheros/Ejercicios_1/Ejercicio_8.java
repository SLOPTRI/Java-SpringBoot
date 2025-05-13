package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_8 {
    public static void main(String[] args) throws IOException {

        int counter = 0;

        BufferedReader reader = new BufferedReader(new FileReader("Java/Repaso_Examen_Ficheros/resources/datos.txt"));
        String line;

        while((line = reader.readLine()) != null){
            counter += 1;
        }
        reader.close();
        System.out.println("El archivo contiene " + counter + " lineas");
    }
}
