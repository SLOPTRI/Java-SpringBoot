import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TrabajoPintura trabajo1 = new TrabajoPintura("Alejandro","Salvador",LocalDate.of(2025,1,23),60.00,2);
        TrabajoPintura trabajo2 = new TrabajoPintura("Alejandro","Salvador",LocalDate.of(2025,1,22),40.00,2);

        RevisionAlarma alarma1 = new RevisionAlarma("Salvador",LocalDate.of(2025,1,23),3);

        System.out.println(trabajo1.detalleServicio());
        System.out.println(trabajo2.detalleServicio());
        System.out.println(alarma1.detalleServicio());
    }
}
