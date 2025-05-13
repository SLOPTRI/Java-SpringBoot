package Ejercicios_Ficheros_1;

import java.io.*;

public class Ejercicio_2_Ficheros {

    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/ej.txt"));
            String linea1;
            BufferedWriter bw = new BufferedWriter(new FileWriter("Ejercicio2.txt"));
            while ((linea1 = br.readLine()) != null) {
                bw.write(linea1);
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Error de escritura: " + e.getMessage());
        }

    }

}
