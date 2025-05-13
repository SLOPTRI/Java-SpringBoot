package Ejercicios1POO;

import java.util.Scanner;

public class Zonas {
    private int plazas;

    public Zonas(int plazas) {
        this.plazas = plazas;
    }

    public String toString(){
        String plazasString = String.valueOf(this.plazas);
        return plazasString;
    }

    public void vender(int plazas){
        if (plazas > this.plazas){
            System.out.println("Entradas no disponibles");
        } else if(this.plazas >= plazas){
            this.plazas -= plazas;
            System.out.println("Entradas vendidas correctamente");
        }
    }

    public static void main(String[] args) {
        Zonas principal = new Zonas(1000);
        Zonas compra = new Zonas(200);
        Zonas vip = new Zonas(25);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la opcion( 1: Mostrar entradas disponibles, 2:Vender, 3:Salir ):");
        int opcion = entrada.nextInt();
        do{
           switch (opcion){
               case 1:
                   System.out.println("Zona Principal: "+principal);
                   System.out.println("Zona Compra: "+compra);
                   System.out.println("Zona Vip: "+vip);
                   System.out.print("Ingrese la opcion( 1: Mostrar entradas disponibles, 2:Vender, 3:Salir ):");
                   opcion = entrada.nextInt();
                   break;
               case 2:
                   System.out.print("Introduce la zona( 1: Principal, 2:Compra Venta, 3:VIP ): ");
                   int albaricoque = entrada.nextInt();
                   int entradas;
                   switch (albaricoque){
                       case 1:
                           System.out.print("Numero de entradas: ");
                           entradas = entrada.nextInt();
                           principal.vender(entradas);
                           break;
                       case 2:
                           System.out.print("Numero de entradas: ");
                           entradas = entrada.nextInt();
                           compra.vender(entradas);
                           break;
                       case 3:
                           System.out.print("Numero de entradas: ");
                           entradas = entrada.nextInt();
                           vip.vender(entradas);
                           break;
                   }
                   System.out.print("Ingrese la opcion( 1: Mostrar entradas disponibles, 2:Vender, 3:Salir ):");
                   opcion = entrada.nextInt();
                   break;
           }
        }while(opcion != 3);
        if (opcion == 3){
            System.out.println("Gracias por su visita");
        }

    }
}
