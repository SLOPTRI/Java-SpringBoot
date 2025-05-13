package GestionNotasAlumnos;

import java.util.Scanner;

public class Estudiante {

   private String nombre;
   private double[][] calificaciones;  // Usar double para las calificaciones
   Scanner scan = new Scanner(System.in);

   public Estudiante(int x, int y) {
      this.nombre = pedirNombreUsuario();  // "x" representa el número de materias y "y" el número de notas por materia
      calificaciones = new double[x][y];
   }

   public String pedirNombreUsuario() {
      System.out.print("Introduce el nombre del estudiante: ");
      String nombre = scan.nextLine();
      return nombre;
   }

   public void agregarNotas() {
      for (int i = 0; i < this.calificaciones.length; i++) {
         for (int j = 0; j < this.calificaciones[i].length; j++) {
            System.out.print("Introduce la nota " + (j + 1) + " de la materia " + (i + 1) + ": ");
            double nota = scan.nextDouble();
            calificaciones[i][j] = nota;  // Almacenar la nota en el arreglo
         }
      }
   }

   public double[] calcularPromedioMaterias() {
      double[] promedios = new double[calificaciones.length];

      for (int i = 0; i < calificaciones.length; i++) {
         double sumaNotas = 0;
         for (int j = 0; j < calificaciones[i].length; j++) {
            sumaNotas += calificaciones[i][j];  // Sumar las notas de la materia
         }
         promedios[i] = sumaNotas / calificaciones[i].length;  // Promedio de la materia
      }

      return promedios;
   }

   public double calcularPromedioGeneral() {
      double promedio = 0;
      double[] notas = calcularPromedioMaterias();

      for (int i = 0; i < notas.length; i++) {
         promedio += notas[i];  // Sumar los promedios de las materias
      }

      return promedio / notas.length;  // Promedio general de todas las materias
   }

   public String toString() {
      double promedioGeneral = calcularPromedioGeneral();
      double[] promedioMateria = calcularPromedioMaterias();
      StringBuilder sb = new StringBuilder();

      sb.append("Alumno: " + this.nombre + ".\n");

      for (int i = 0; i < promedioMateria.length; i++) {
         sb.append("Materia " + (i + 1) + " = " + promedioMateria[i] + "\n");
      }

      sb.append("Promedio general: " + promedioGeneral);

      return sb.toString();
   }

   public String getNombre(){
      return this.nombre;
   }

}
