package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("Java/Repaso_Examen_Ficheros/resources/datos.txt");
        BufferedReader bf = new BufferedReader(file);
        String line;

        while((line = bf.readLine()) != null){
            System.out.println(line);
        }
        file.close();
        bf.close();
    }
}
