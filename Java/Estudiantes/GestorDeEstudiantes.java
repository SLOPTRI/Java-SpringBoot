import java.util.ArrayList;
import java.util.Collections;

public class GestorDeEstudiantes {
    private ArrayList<Estudiantes> estudiantes;

    public GestorDeEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiantes estudiante) {
        this.estudiantes.add(estudiante);
    }
    public void alerta(Estudiantes estudiante) {
        double nota = estudiante.calcularPromedioGeneral();

        if (nota < 5) {
            System.out.println(estudiante.getNombre()+", te vas a quedar sin play");
        }
    }
    public void MVP(){
        Estudiantes mejorEstudiante = this.estudiantes.get(0);
        double mejorNota = mejorEstudiante.calcularPromedioGeneral();

        for (Estudiantes estudiante : this.estudiantes) {
            double nota = estudiante.calcularPromedioGeneral();
            if (nota > mejorNota) {
                mejorNota = nota;
                mejorEstudiante = estudiante;
            }
        }
        System.out.println("The MVP is " + mejorEstudiante.getNombre()+" con una media de: "+mejorEstudiante.calcularPromedioGeneral());
    }
}
