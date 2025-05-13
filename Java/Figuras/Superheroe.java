package Figuras;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    public boolean getCapa() {
        return capa;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nombre: " + nombre + "\n");
        str.append("Descripcion: " + descripcion + "\n");
        if (capa) {
            str.append("Capa: Si lleva" + "\n");
        } else {
            str.append("Capa: No lleva" + "\n");
        }
        return str.toString();
    }
}
