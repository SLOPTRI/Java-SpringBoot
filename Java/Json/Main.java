package Json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos usuarios quiere crear? ");
        int nUsers = sc.nextInt();

        String nombre;
        String email;
        int edad;

       ArrayList<Usuario> lista = new ArrayList<>();

        for (int i = 1; i <= nUsers; i++){

            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            System.out.println("\n");

            Usuario conejilloIndias = new Usuario(nombre,email,edad);

            lista.add(conejilloIndias);
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("Json/Usuarios.json"),lista);
        maduros(lista);

        /*
        * Anade un campo int edad a la clase Json_.Usuario y por tanto, modifica el JSON
        * Modifica la lista para que se lea desde teclado antes de guardarla
        * Crea un metodo que recorra la lista y muestre los ususrios mayores de 30
        *
        * Ejemplo de uso de consola:
        *   Cuantos usuarios quieres introducir? 4
        *   Introduce los datos del usuario 1:
        *   Nombre: X
        *   Email: x@
        *   Edad: y
        *
        *   .....
        *
        *   Usuarios mayores a 30 anos:
        *   ...
        *
        *
        * */
    }
    public static void maduros(ArrayList<Usuario> lista) throws IOException {
        ArrayList<Usuario> listaMaduritos = new ArrayList<>();
        for(Usuario u: lista){
            if(u.getEdad()>30){
                listaMaduritos.add(u);
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("Json/UsuariosMaduros.json"),listaMaduritos);
    }
}