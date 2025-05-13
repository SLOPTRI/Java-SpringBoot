package Ejercicios_Ficheros_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_3_Ficheros {
    //Realiza un programa que reciba un fichero como argumento y muestre cuántas veces aparece una palabra dada.

    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/ej.txt"));

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
