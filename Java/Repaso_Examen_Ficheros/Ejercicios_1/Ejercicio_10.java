package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.File;
import java.io.IOException;

public class Ejercicio_10 {
    public static void main(String[] args) throws IOException {

        File deleteFile = new File("Java/Repaso_Examen_Ficheros/resources/datos.txt");

        if(deleteFile.exists()){
            deleteFile.delete();
        }

    }
}
