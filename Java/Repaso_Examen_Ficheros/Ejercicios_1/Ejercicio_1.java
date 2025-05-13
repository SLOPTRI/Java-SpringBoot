import java.io.File;
import java.io.IOException;

public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {

        File file = new File("resources/datos.txt");
        file.createNewFile(); //metodo createNewFile() de la clase File

    }
}
