package Repaso_Examen_Ficheros.CRUD;

public class Usuario {

    private int id;
    private String nombre;
    private String mail;

    public Usuario(int id,String nombre, String mail){
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
    }

    public Usuario(){}

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getMail(){
        return this.mail;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String toString(){
        return "ID: "+ id + "\nNombre de usuario: " + nombre + "\nCorreo electronico: " + mail;
    }
}
