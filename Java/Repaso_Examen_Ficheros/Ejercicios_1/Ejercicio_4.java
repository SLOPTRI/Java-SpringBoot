import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_4 {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("resources/datos.txt",true));
        writer.newLine();
        writer.write("Hola buenas tardes");

        writer.close();
    }
}
