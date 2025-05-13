import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio_13 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileIn = new FileInputStream(new File("resources/img.jpg"));
        FileOutputStream fileOut = new FileOutputStream(new File("resources/imgCopy.jpg"));

        long bytes = fileIn.transferTo(fileOut);
        System.out.println("Copiados: " + bytes + " bytes");
        fileIn.close();
        fileOut.close();

    }
}
