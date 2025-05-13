package Figuras;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Figura> listaFiguras;
    private String nombreColeccion;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }
    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void agregarFigura(Figura fig){
        this.listaFiguras.add(fig);
    }
    public void subirPrecio(double cantidad, String id){
        for (Figura fig : this.listaFiguras) {
            if(fig.getCodigo() == id){
                fig.subirPrecio(cantidad);
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Figura fig : this.listaFiguras) {
            sb.append(fig.toString());
        }
        return sb.toString();
    }
    public String conCapa(){
        StringBuilder sb = new StringBuilder();
        for (Figura fig : this.listaFiguras) {
            Superheroe superheroe = fig.getSuperheroe();
            if(superheroe.getCapa() != false){
                sb.append(fig.toString());
            }
        }
        return sb.toString();
    }
}
