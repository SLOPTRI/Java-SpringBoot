package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_11 {
    public static void main(String[] args) throws IOException {

        File file = new File("Java/Repaso_Examen_Ficheros/resources");
        File[] fileList = file.listFiles();

        for(File x : fileList){
            if(x.isDirectory()){
                System.out.println(x + " Es un directorio");
            } else {
                System.out.println(x + " Es un archivo");
            }
        }

    }
}
