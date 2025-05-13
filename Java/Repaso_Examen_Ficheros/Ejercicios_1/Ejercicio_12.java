import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_12 {
    public static void main(String[] args) throws IOException {

        BufferedReader readerCSV = new BufferedReader(new FileReader("resources/datos.csv"));
        String line;

        while ((line = readerCSV.readLine()) != null) {
            String[] lineArray = line.split(",");

            for (String x : lineArray) {
                System.out.printf("%-15s", x);
            }
            System.out.println();
        }

    }
}
