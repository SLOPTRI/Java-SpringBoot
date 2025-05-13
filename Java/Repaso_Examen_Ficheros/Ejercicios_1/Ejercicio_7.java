import java.io.*;
import java.util.Objects;

public class Ejercicio_7 {
    public static void main(String[] args) throws IOException {

        String word = "Hola";
        int counter = 0;

        BufferedReader reader = new BufferedReader(new FileReader("resources/datos.txt"));
        String line;
        String[] words;

        while((line = reader.readLine()) != null){
            words = line.split(" ");
            for (String x : words){
                if (x.equals(word)){
                    counter += 1;
                }
            }
        }
        reader.close();
        System.out.println("La palabra " + " '"+ word + "' " + " aparece " + counter + " veces.");
    }
}
