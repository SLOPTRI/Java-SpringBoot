import java.io.File;
import java.io.IOException;

public class Ejercicio_10 {
    public static void main(String[] args) throws IOException {

        File deleteFile = new File("resources/datos.txt");

        if(deleteFile.exists()){
            deleteFile.delete();
        }

    }
}
