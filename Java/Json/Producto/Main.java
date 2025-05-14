package Json.Producto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Producto p1 = new Producto("TecladoWapo",100);
        crearJson(p1);

        Producto p2 = leerJson(new File("Producto/archivoCreado.json"));
        p2.toString();

    }

    public static void crearJson(Producto p) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("Producto/archivoCreado.json"),p);
    }

    public static Producto leerJson(File ruta) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Producto p = mapper.readValue(ruta,Producto.class);
        return  p;
    }
}
