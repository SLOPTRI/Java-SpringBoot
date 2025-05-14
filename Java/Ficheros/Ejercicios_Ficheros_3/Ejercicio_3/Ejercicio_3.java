package Ejercicios_Ficheros_3.Ejercicio_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_3 {

    /*
    * Implementa un programa que pida al usuario un nombre de archivo A para lectura y otro nombre de
    * archivo B para escritura. Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt') y lo
    * escribirá ordenado alfabéticamente en B (por ejemplo 'usa_personas_sorted.txt').
    * */

    public static void main(String[] args) throws RuntimeException, IOException{

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Introduce el nombre del archivo a: ");
        //String archivoA = sc.nextLine();
        //System.out.println("Introduce el nombre del archivo b: ");
        //String archivoB = sc.nextLine();
        String archivoA = "Java/Ficheros/Ejercicios_Ficheros_3/Documentos/usa_personas.txt";
        String archivoB = "Java/Ficheros/Ejercicios_Ficheros_3/Documentos/usa_personas_sorted.txt";

        ordenarArchivo(archivoA,archivoB);

    }

    public static void ordenarArchivo(String origin,String dest){
        try(FileWriter fw = new FileWriter(new File(dest))){

            ArrayList palabras = new ArrayList<>();
            File archivoApath = new File(origin);

            FileReader fr = new FileReader(archivoApath);
            BufferedReader bf = new BufferedReader(fr);
            String linea;

            while((linea = bf.readLine()) != null){
                palabras.add(linea);
            }
            fr.close();
            bf.close();

            Collections.sort(palabras);

            palabras.forEach(palabra -> {
                try {
                    fw.write((String) palabra+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            fw.close();

        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
            throw  new RuntimeException(e);
        }
    }
}
