package Figuras;

public class Figura {
    private String codigo;
    private int precio;
    private Superheroe obj = new Superheroe("");
    private Dimension objDim = new Dimension();

    public Figura(String codigo, int precio, Dimension objDim, Superheroe obj){
        this.codigo = codigo;
        this.precio = precio;
        this.obj = obj;
        this.objDim = objDim;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setSuperheroe(Superheroe obj){
        this.obj = obj;
    }
    public void setDimension(Dimension obj){
        this.objDim = obj;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getPrecio(){
        return precio;
    }
    public Superheroe getSuperheroe(){
        return obj;
    }
    public Dimension getDimension(){
        return objDim;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Codigo: "+codigo+"\n");
        builder.append("Precio: "+precio+" € \n");
        builder.append("Superheroe: "+obj.toString()+"\n");
        builder.append("Dimension: "+objDim.toString()+"\n");
        return builder.toString();
    }

    public void subirPrecio(double cantidad){
        this.precio += cantidad;
    }
}
