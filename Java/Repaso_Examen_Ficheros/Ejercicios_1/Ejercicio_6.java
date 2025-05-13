package Repaso_Examen_Ficheros.Ejercicios_1;

import java.io.*;

public class Ejercicio_6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Java/Repaso_Examen_Ficheros/resources/datos.txt"));
        BufferedWriter writer = new BufferedWriter (new FileWriter("Java/Repaso_Examen_Ficheros/resources/datosCopia.txt"));
        String line;

        while((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        reader.close();

    }
}
