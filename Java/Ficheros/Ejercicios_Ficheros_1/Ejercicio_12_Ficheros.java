package Ejercicios_Ficheros_1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio_12_Ficheros {

    /*
    * Ejercicio 12: Leer un archivo CSV y mostrar los datos
    * Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
    */

    public static void main(String[] args) {

        String ruta = "/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/archivo.csv";

        try{

            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            System.out.println("Contenido del CSV: \n");
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                for(String dato : datos){
                    if (!dato.isEmpty()){
                        System.out.printf("%-15s",dato.trim());
                    }
                }
                System.out.println();
            }

        } catch (Exception e) {

        }
    }
}
