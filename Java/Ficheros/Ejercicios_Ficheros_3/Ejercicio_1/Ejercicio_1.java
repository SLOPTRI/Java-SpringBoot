package Ejercicios_Ficheros_3.Ejercicio_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_1 {

    public static void main(String[] args) {

        String rutaNumeros = "/home/slt/Escritorio/Programacion/Java/Ficheros/Ejercicios_Ficheros_3/Documentos/numeros.txt";
        System.out.println("Minimo: "+findMinimun(rutaNumeros));
        System.out.println("Maximo: "+findMaximum(rutaNumeros));

    }

    public static int findMinimun(String rutaNumeros){

        int min = 1000000000;

        try(BufferedReader br = new BufferedReader(new FileReader(rutaNumeros))){

            String linea;
            while((linea = br.readLine()) != null) {

                int n = Integer.parseInt(linea);

                if (n < min) {
                    min = n;
                }

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return min;
    }
    public static int findMaximum(String rutaNumeros){

        int min = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(rutaNumeros))){

            String linea;
            while((linea = br.readLine()) != null) {

                int n = Integer.parseInt(linea);

                if (n > min) {
                    min = n;
                }

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return min;
    }

}