import java.io.*;

public class Ejercicio_6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("resources/datos.txt"));
        BufferedWriter writer = new BufferedWriter (new FileWriter("resources/datosCopia.txt"));
        String line;

        while((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        reader.close();

    }
}
