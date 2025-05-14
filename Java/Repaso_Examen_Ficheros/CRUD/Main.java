package Repaso_Examen_Ficheros.CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Usuario> listaUsuarios = leerJson("Java/Repaso_Examen_Ficheros/CRUD/Usuarios.json");
        int op = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=== GESTOR DE USUARIOS ===");
            System.out.println(" 1. Agregar Usuario\n" +
                    " 2. Eliminar Usuario\n" +
                    " 3. Listar todos los Usuarios\n" +
                    " 4. Guardar y salir");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();

            switch (op){
                case 1: crearUsuario(listaUsuarios);
                    break;
                case 2: borrarUsuario(listaUsuarios);
                    break;
                case 3: listarUsuarios(listaUsuarios);
                    break;
                case 4: guardarJson("Java/Repaso_Examen_Ficheros/CRUD/Usuarios.json", listaUsuarios);
                    op = 10;
            }
        } while(op < 6 & op > 0);
    }

    public static List<Usuario> leerJson(String jsonPath) throws IOException {
        List<Usuario> listaUsuarios;
        ObjectMapper mapper = new ObjectMapper();

        File x = new File(jsonPath);

        if (x.exists()){
            listaUsuarios = mapper.readValue(x, new TypeReference<List<Usuario>>() {
            });
        } else {
            listaUsuarios = new ArrayList<>();
        }
        return listaUsuarios;
    }

    public static void crearUsuario(List<Usuario> listaUsuarios){
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("eMail: ");
        String mail = sc.next();

        listaUsuarios.add(new Usuario(id,nombre,mail));
    }

    public static void borrarUsuario(List<Usuario> listaUsuarios){

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();

        for(Usuario x : listaUsuarios){
            if(x.getId() == id){
                listaUsuarios.remove(x);
            }
        }
    }

    public static void guardarJson(String jsonPath,List<Usuario> listaUsuarios) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File(jsonPath), listaUsuarios);
    }

    public static void listarUsuarios(List<Usuario> lista){
        lista.forEach( x -> {
            System.out.println("\n"+x+"\n");
        });
    }
}
