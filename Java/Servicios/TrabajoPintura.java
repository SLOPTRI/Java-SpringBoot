import java.time.LocalDate;
import java.util.Date;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador,String cliente, LocalDate fechaInicio, double superficie,double precioPintura){
        super(trabajador,fechaInicio,cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        superficie = superficie;
    }
    public double getPrecioPintura() {
        return precioPintura;
    }
    public void setPrecioPintura(double precioPintura) {
        precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        double precio = (getSuperficie()/7.8)*getPrecioPintura();
        return precio;
    }

    @Override
    public double costeManoObra() {
        double precio = (getSuperficie()/10)*9.5;
        return precio;
    }

    @Override
    public double costeTotal() {
        double precio = costeMaterial()+costeManoObra();
        if(getSuperficie() < 50){
            precio *= 1.15;
        }
        return precio;
    }

    public String detalleServicio(){
        double costeAdicional =0.0;
        StringBuilder detalle = new StringBuilder();
        detalle.append("TRABAJO DE PINTURA\n");
        detalle.append("Cliente: "+getCliente()+"\n");
        detalle.append("Fecha de inicio: "+getFechaInicio()+"\n");
        detalle.append("------------------------------- \n");
        detalle.append("Pintor: "+getTrabajador()+"\n");
        detalle.append("Coste Material..... "+costeMaterial()+"$ \n");
        detalle.append("Coste Mano Obra.... "+costeManoObra()+"$ \n");

        if(getSuperficie() < 50) {
            costeAdicional = (costeTotal() * 15) / 100;
        }
        detalle.append("Coste Adicional.... " + costeAdicional + "$ \n");
        detalle.append("TOTAL: ............ "+costeTotal()+"$ \n");
        detalle.append("------------------------------");
        return detalle.toString();
    }
}

