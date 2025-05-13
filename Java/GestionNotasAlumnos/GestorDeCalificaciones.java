package GestionNotasAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeCalificaciones {

   protected ArrayList<Estudiante> lista;

   public GestorDeCalificaciones(){

      lista = new ArrayList<>();

   }

   public void agregarEstudiante(){

      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce el numero de materias: ");
      int x = sc.nextInt();
      System.out.println("Introduce el numero de criterios: ");
      int y = sc.nextInt();

      Estudiante zz = new Estudiante(x,y);
      zz.agregarNotas();
      lista.add(zz);

   }

   public void alerta(Estudiante e){

      if(e.calcularPromedioGeneral() < 5.0){
         System.out.println("Espabila campeon");
      } else {
         System.out.println("Este va mas o menos");
      }

   }

   public void MVP(){

      Estudiante bestiaparda = this.lista.get(0);

      for(Estudiante x : this.lista){
         if(x.calcularPromedioGeneral() > bestiaparda.calcularPromedioGeneral()){
            bestiaparda = x;
         }
      }

      System.out.println("El mejor estudiante es: "+ bestiaparda.getNombre());

   }

   public String toString(){
      StringBuilder sb = new StringBuilder();
      int i = 0;

      for (Estudiante e: this.lista){
         sb.append("/ "+i+" "+e.getNombre()+" /");
         i+=1;
      }

      return sb.toString();
   }

}
