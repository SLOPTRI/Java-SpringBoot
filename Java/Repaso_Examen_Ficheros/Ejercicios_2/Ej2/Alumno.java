package Repaso_Examen_Ficheros.Ejercicios_2.Ej2;

public class Alumno {

    private String nombre;
    private String apellido;
    private Double notaMedia;

    public Alumno(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = 0.0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotaMedia(Double x){
        this.notaMedia = x;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nombre: " + nombre + "\nApellido: " + apellido + "\nNota Media: " + notaMedia);
        return builder.toString();
    }
}
