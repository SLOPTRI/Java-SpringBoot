import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int n_alarmas;

    public RevisionAlarma(String cliente, LocalDate fechaInicio, int n_alarmas) {
        super("Revisor Especialista Contraincendios",fechaInicio,cliente);
        this.n_alarmas = n_alarmas;
    }

    public int getN_alarmas() {
        return n_alarmas;
    }
    public void setN_alarmas(int n_alarmas) {
        this.n_alarmas = n_alarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (n_alarmas/3)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    public String detalleServicio(){
        StringBuilder detalle = new StringBuilder();
        detalle.append("REVISION PERIODICA ALARMAS CONTRAINCENDIOS \n");
        detalle.append("Cliente: "+getCliente()+"\n");
        detalle.append("Fecha revision: "+getFechaInicio()+"\n");
        detalle.append("------------------------------------- \n");
        detalle.append("TOTAL: ....... "+costeTotal()+"\n");
        detalle.append("-------------------------------------");
        return detalle.toString();
    }
}
