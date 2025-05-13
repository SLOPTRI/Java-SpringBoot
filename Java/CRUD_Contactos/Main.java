package CRUD_Contactos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        List listaGestora = leerJson();
        int op;

        do {
            System.out.println("=== GESTOR DE CONTACTOS ===");
            System.out.println(" 1. Agregar contacto\n" +
                    " 2. Eliminar contacto\n" +
                    " 3. Buscar contacto\n" +
                    " 4. Listar todos los contactos\n" +
                    " 5. Guardar y salir");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();

            switch (op){
                case 1: agregarContacto(listaGestora);
                        break;
                case 2: eliminarContacto(listaGestora);
                        break;
                case 3: buscarContacto(listaGestora);
                        break;
                case 4: contactosToString(listaGestora);
                        break;
                case 5: guardarJson(listaGestora);
                        op = 10;
            }
        } while(op < 6 & op > 0);

    }

    public static void agregarContacto(List<Contacto> lista){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String name = sc.next();
        System.out.print("TLF: ");
        int tlf = sc.nextInt();
        System.out.print("Mail: ");
        String mail = sc.next();

        lista.add(new Contacto(name,tlf,mail));
        System.out.println("\nContacto agregado correctamente...");
    }

    public static void eliminarContacto(List<Contacto> lista){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del contacto que quiere eliminar: ");
        String name = sc.next();
        listaVacia(lista);

        for(Contacto x: lista){
            if (x.getName().equals(name)){
                lista.remove(x);
                System.out.println("\nContacto eliminado correctamente...");
                break;
            } else{
                continue;
            }
        }
    }

    public static void buscarContacto(List<Contacto> lista){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre que quiere buscar: ");
        String name = sc.nextLine();

        listaVacia(lista);

        for(Contacto x:lista){
            if(x.getName().equals(name)){
                System.out.println(x);
            }
        }
    }

    public static void listaVacia(List lista){
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }
    }

    public static void contactosToString(List<Contacto> lista){
        listaVacia(lista);

        for (Contacto x : lista){
            System.out.println(x+"\n");
        }
    }

    public static void guardarJson(List<Contacto> lista) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("CRUD_Contactos/AgendaContactos.json"), lista);
    }

    public static List leerJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacto> lista;

        if(new File("CRUD_Contactos/AgendaContactos.json").exists()){
            lista = mapper.readValue(new File("CRUD_Contactos/AgendaContactos.json"), new TypeReference<List<Contacto>>() {
            });
        } else{
            lista = new ArrayList<>();
        }

        return lista;
    }
}
