package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.*;

public class Ejercicio_2 {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("Java/Repaso_Examen_Ficheros/resources/datos.txt");
        int x;

        while((x = file.read()) != -1){
            System.out.println((char) x );
        }
        file.close();
    }
}
