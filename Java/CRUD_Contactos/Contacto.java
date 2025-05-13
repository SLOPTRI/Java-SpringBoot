package CRUD_Contactos;

public class Contacto {

    private String name;
    private int tlf;
    private String mail;


    public Contacto(String nombre, int tlf, String email) {
        this.name = nombre;
        this.tlf = tlf;
        this.mail = email;
    }

    public Contacto(){}

    public String getName() {
        return this.name;
    }

    public int getTlf(){
        return this.tlf;
    }

    public String getMail(){
        return this.mail;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setTlf(int tlf){
        this.tlf = tlf;
    }
    public void setMail(String mail){
        this.mail = mail;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: "+getName()+"\n");
        sb.append("Telefono: "+getTlf()+"\n");
        sb.append("Mail: "+getMail());

        return sb.toString();
    }
}
