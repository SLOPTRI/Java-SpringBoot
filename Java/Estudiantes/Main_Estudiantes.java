public class Main_Estudiantes {
    public static void main(String[] args) {
        double[][] calificaciones = {
                {3.5, 4.0, 2.0},
                {3.0, 1.5, 6.0},
        };
        double[][] calificaciones2 = {
                {8.5, 7.0, 9.0},
                {9.0, 6.5, 8.0},
                {9.0, 5.5, 7.0},
        };
        double[][] calificaciones3 = {
                {9.5, 7.0, 9.0},
                {9.0, 6.5, 8.0},
                {9.0, 5.5, 7.0},
        };

        Estudiantes Estudiante1 = new Estudiantes("Franco", calificaciones);
        Estudiantes Estudiante2 = new Estudiantes("Echenike", calificaciones2);
        Estudiantes Estudiante3 = new Estudiantes("Oscar", calificaciones3);

        GestorDeEstudiantes estudiantes = new GestorDeEstudiantes();
        estudiantes.agregarEstudiante(Estudiante1);
        estudiantes.agregarEstudiante(Estudiante2);
        estudiantes.agregarEstudiante(Estudiante3);

        estudiantes.alerta(Estudiante1);
        estudiantes.MVP();
    }
}

