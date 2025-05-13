package Ejercicios_Ficheros_1;

import java.io.File;

public class Ejercicio_11_Ficheros {
    public static void main(String[] args) {
        File directorio = new File("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/");

        if (directorio.isDirectory()) {
            File[] elementos = directorio.listFiles();
            if (elementos != null) {
                for (File elemento : elementos) {
                    String tipo = "Archivo";
                    if (elemento.isDirectory()) {
                        tipo = "Directorio";
                    }
                    System.out.println(tipo + " - " + elemento.getName());
                }
            } else {
                System.out.println("La ruta especificada no es un directorio");
            }

        }
    }
}