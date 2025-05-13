package Ejercicios_Ficheros_1;

import java.io.File;

public class Ejercicio_9_Ficheros {

    public static void main(String[] args) {

        try{
            File archivoOG = new File("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/ej.txt");
            File archivoCP = new File("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/Prueba.txt");

            if(archivoOG.renameTo(archivoCP)){
                System.out.println("El archivo se ha renombrado correctamente");
            } else{
                System.out.println("El archivo no se ha renombrado correctamente");
            }
        }catch (Exception e){
            System.out.println(" :"+e.getMessage());
        }

    }

}
