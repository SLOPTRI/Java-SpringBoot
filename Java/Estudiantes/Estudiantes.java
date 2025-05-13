public class Estudiantes {

    private String nombre;
    private double calificaciones[][];

    public Estudiantes(String nombre, double calificaciones[][]) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    public String getNombre() {
        return nombre;
    }
    public double[] calcularPromedioMaterias() {
        int numMaterias = calificaciones.length;
        double[] promedios = new double[numMaterias];

        for (int i = 0; i < numMaterias; i++) {
            double suma = 0;
            int numNotas = calificaciones[i].length;

            for (int j = 0; j < numNotas; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / numNotas;
        }
        return promedios;
    }

    public double calcularPromedioGeneral(){
        double notas[] = calcularPromedioMaterias();
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i] / notas.length;
        }
        return promedio;
    }

    public String toString() {
        double[] promedios = this.calcularPromedioMaterias();
        StringBuilder builder = new StringBuilder();
        builder.append("Promedios de materias - "+this.nombre+"\n");
        for (int i = 0; i < promedios.length; i++) {
            builder.append("Materia " + (i + 1) + " - " + promedios[i]+"\n");
        }
        builder.append("Media del alumno: "+this.calcularPromedioGeneral());
        return builder.toString();
    }

}
