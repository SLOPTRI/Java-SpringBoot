package Ejercicios_Ficheros_1;

import java.io.*;
import java.util.Scanner;

public class NArchivos {

    public static void main(String[] args) {

        // Crear N archivos, nombre(1).txt , nombre(2).txt , ... en la carpeta que se solicita al usuario. Dentro de cada archivo debe escribirse la frase "Este es el fichero nombre(n).txt".

        String ruta = "/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src";

        try{

            //Creamos la carpeta donde iran todos los archivos si no existe.
            File fichero = new File(ruta+"/NArchivos");

            if(!fichero.exists()){
                fichero.mkdirs();
            }

            //Pedimos al usuario el numero de archivos que quiere crear.

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el numero de archivos que quiere crear: ");
            int op = sc.nextInt();
            sc.close();

            for(int i = 1; i <= op; i++){
                String texto = "Este es el fichero nombre("+i+").txt";
                String nombre = "nombre("+i+").txt";
                //Creamos el archivo.
                File archivo = new File(fichero, nombre);

                //Escribimos dentro del archivo creado.
                FileWriter fw = new FileWriter(archivo);
                fw.write(texto);
                fw.close();
            }

        } catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }

    }

}
