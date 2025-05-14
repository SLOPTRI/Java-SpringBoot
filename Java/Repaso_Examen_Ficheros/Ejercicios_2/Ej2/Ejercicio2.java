package Repaso_Examen_Ficheros.Ejercicios_2.Ej2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {

        File studentsFile = new File("Java/Repaso_Examen_Ficheros/resources/Documentos/alumnos_notas.txt");

        List<Alumno> listaAlumnos = listaAlumnos(studentsFile);


        for(Alumno x : listaAlumnos){
            System.out.println(x + "\n");
        }

    }

    public static Double calcularNotaMedia(List<Double> list){

        double x = 0.0;

        for(int i = 0; i < list.size(); i++){
            x += list.get(i);
        }

        return x / list.size();
    }

    public static List<Alumno> listaAlumnos(File x){
        List<Alumno> lista = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(x))){

            String line;

            while((line = reader.readLine()) != null){

                String[] alumnos = line.split(" ");

                String nombre = alumnos[0];
                String apellido = alumnos[1];

                Alumno alumno = new Alumno(nombre,apellido);

                double notaMedia;
                List<Double> notas = new ArrayList<>();

                for (int i = 2; i < alumnos.length; i++){
                    notas.add(Double.parseDouble(alumnos[i]));
                }
                notaMedia = calcularNotaMedia(notas);
                alumno.setNotaMedia(notaMedia);

                lista.add(alumno);
                lista.sort(Comparator.comparing((Alumno a) -> a.getNotaMedia()).reversed());
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
}
