package Repaso_Examen_Ficheros.Ejercicios_2.Ej1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Java/Repaso_Examen_Ficheros/resources/numeros.txt"));
        String line;

        int x = Integer.MIN_VALUE;
        int y = Integer.MAX_VALUE;

        while ((line = reader.readLine()) != null) {
            String[] numberArray = line.split("\n");

            for (String number : numberArray) {
                int numberInt = Integer.parseInt(number);

                if (numberInt >= x) {
                    x = numberInt;
                } else if (numberInt <= y) {
                    y = numberInt;
                }
            }
        }

        System.out.println("Maximo: " + x);
        System.out.println("Minimo: " + y);

    }
}
