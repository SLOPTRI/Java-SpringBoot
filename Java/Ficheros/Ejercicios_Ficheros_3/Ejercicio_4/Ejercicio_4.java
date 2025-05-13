package Ejercicios_Ficheros_3.Ejercicio_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_4 {

    public static void main(String[] args){

        String pathNames = "/home/slt/Escritorio/Programacion/Java/Ficheros/Ejercicios_Ficheros_3/Documentos/usa_nombres.txt";
        String pathLastName = "/home/slt/Escritorio/Programacion/Java/Ficheros/Ejercicios_Ficheros_3/Documentos/usa_apellidos.txt";

        System.out.println(nameGenerator(pathNames,pathLastName));

    }

    public static String nameGenerator(String pathNames,String pathLastNames) {

        String names;
        String lastNames;

        ArrayList namesList = new ArrayList<>();
        ArrayList lastNamesList = new ArrayList<>();

        String name_lastName;

        Random random = new Random();

        try (BufferedReader br = new BufferedReader(new FileReader(new File(pathNames)))) {

            BufferedReader bx = new BufferedReader(new FileReader(new File(pathLastNames)));

            while ((names = br.readLine()) != null) {
                namesList.add(names);
            }
            while ((lastNames = bx.readLine()) != null) {
                lastNamesList.add(lastNames);
            }

            String name = (String) namesList.get(random.nextInt(namesList.size()));
            String lastName = (String) lastNamesList.get(random.nextInt(lastNamesList.size()));

            name_lastName = name +" "+lastName;
            bx.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return name_lastName;
    }
}
