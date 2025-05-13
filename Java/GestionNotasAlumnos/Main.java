package GestionNotasAlumnos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      GestorDeCalificaciones lista = new GestorDeCalificaciones();
      int op = 1;

      while(op != 0){
         System.out.println("\n 1: Agregar Estudiante");
         System.out.println("2: Calcular Promedios");
         System.out.println("3: Alertas");
         System.out.println("4: Mejor Estudiante");
         System.out.println("5: Mostrar Lista");
         System.out.print("------------------------------: ");
         op = sc.nextInt();

         if (op == 0){
            break;
         }

         switch (op){
            case 1:
               lista.agregarEstudiante();
               break;
            case 2:
               System.out.println(lista);
               System.out.println("De que estudiante quieres calcular el promedio de sus materias: ");
               Estudiante e1 = lista.lista.get(sc.nextInt());
               System.out.println(e1);
               break;
            case 3:
               System.out.println(lista);
               System.out.println("De que estudiante quieres calcular el promedio de sus materias: ");
               Estudiante e2 = lista.lista.get(sc.nextInt());
               lista.alerta(e2);
               break;
            case 4:
               lista.MVP();
               break;
            case 5:
               System.out.println(lista);
         }
      }

   }
}
