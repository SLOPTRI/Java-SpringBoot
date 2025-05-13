package Ejercicios_Ficheros_3.Ejercicios_Moodle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;

public class EjercicioA {

    /*Implementa un programa que cree, dentro de ‘Documentos’,
    dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las
    carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de
    ‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’.
    Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar*/

    public static void main(String[] args){

        String docPath = "/home/slt/Escritorio/Programacion/Java/Ficheros/Ejercicios_Ficheros_3/Documentos";

        File misCosas = new File(docPath,"Mis_Cosas");
        File alfabeto = new File(docPath,"Alfabeto");

        misCosas.mkdir();
        alfabeto.mkdir();
        System.out.println(alfabeto.toString());

        File fotografias = new File(docPath,"Fotografias");
        File libros = new File(docPath,"Libros");

        try
        {

            File destFotografias = new File(misCosas.toString(),"/Fotografias");
            File destLibros = new File(misCosas.toString(),"/Libros");

            Files.move(fotografias.toPath(),destFotografias.toPath(), StandardCopyOption.REPLACE_EXISTING);
            Files.move(libros.toPath(),destLibros.toPath(), StandardCopyOption.REPLACE_EXISTING);

            for(char letra = 'A'; letra <= 'Z'; letra++){
                File x = new File(alfabeto,String.valueOf(letra));
                x.mkdir();
            }

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }


    }

}
