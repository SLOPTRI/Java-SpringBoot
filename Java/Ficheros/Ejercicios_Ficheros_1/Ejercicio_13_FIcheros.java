package Ejercicios_Ficheros_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio_13_FIcheros {

    public static void main(String[] args) {

        // Copiar un archivo binario
        copiarConTransferTo("/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/tux.jpg",
                "/home/ltsalvador/Desktop/Programacion/Java/Ficheros/src/tux2.png");

    }

    private static void copiarArchivoBinario(String imagenOrigen, String imagenDestino){

        try{

            //Creamos flujos de entrada y salida.
            FileInputStream in = new FileInputStream(imagenOrigen);
            FileOutputStream out = new FileOutputStream(imagenDestino);

            //Buffer para leer y ecribir bloques de datos

            File og = new File(imagenOrigen);
            int bytes = Math.toIntExact(og.length());
            byte[] buffer = new byte[bytes];
            int bytesleidos;

            while ((bytesleidos = in.read(buffer)) != -1){
                out.write(buffer, 0, bytesleidos);
            }

            in.close();
            out.close();
        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void copiarConTransferTo(String imagenOrigen, String imagenDestino){

        try{
            //Creamos flujos de entrada y salida.
            FileInputStream in = new FileInputStream(imagenOrigen);
            FileOutputStream out = new FileOutputStream(imagenDestino);

            long bytes = in.transferTo(out);
            System.out.println("Transferred: "+bytes);
            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }

}
