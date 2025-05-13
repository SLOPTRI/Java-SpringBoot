package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.File;
import java.io.IOException;

public class Ejercicio_9 {
    public static void main(String[] args) throws IOException {

        File ogFile = new File("Java/Repaso_Examen_Ficheros/resources/datos.txt");
        File newFile = new File("Java/Repaso_Examen_Ficheros/resources/re_datos.txt");

        if(ogFile.exists()){
            ogFile.renameTo(newFile);
            if(!newFile.exists()){
                System.out.println("El archivo no se ha podido renombrar");
            } else {
                System.out.println("Archivo renombrado con exito");
            }
        }

    }
}
