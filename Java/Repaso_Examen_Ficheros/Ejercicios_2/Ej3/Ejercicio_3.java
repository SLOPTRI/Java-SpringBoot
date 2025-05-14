package Repaso_Examen_Ficheros.Ejercicios_2.Ej3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio_3 {

    public static void main(String[] args) {

        String origen = "Java/Repaso_Examen_Ficheros/resources/Documentos/usa_personas.txt";
        String destino = "Java/Repaso_Examen_Ficheros/resources/Documentos/usa_personas_sorted.txt";

        orderarArchivo(origen,destino);

    }

    public static void orderarArchivo(String origen, String destino){

        try (BufferedReader reader = new BufferedReader(new FileReader(origen)); BufferedWriter writer = new BufferedWriter(new FileWriter(destino))){

            String line;
            ArrayList<String> lineas = new ArrayList<>();

            while((line = reader.readLine()) != null){
                lineas.add(line);
            }

            Collections.sort(lineas);
            lineas.forEach(linea ->{
                try {
                    writer.write((String) linea + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}


