import java.util.Scanner;

public class Ventas {
    /**
     * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
     *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
     *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
     *  - Mostrar la tabla completa de ventas.
     *  - Calcular y mostrar el total de ventas por producto.
     *  - Determinar qué producto tuvo el mayor total de ventas
     *
     */

    private int tabla[][];

    public Ventas() {
        this.tabla = new int[3][2];
    }

    public void agregar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Producto n* : "+(i+1)+" dia n* : "+(j+1));
                System.out.print("Ingrese el numero de ventas: ");
                this.tabla[i][j] = sc.nextInt();
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tabla.length; i++) {
            for (int j = 0; j < this.tabla[i].length; j++) {
                sb.append(this.tabla[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void total_ventas(){
        for (int i = 0; i < 3; i++) {
            int t_producto = this.tabla[i][0] + this.tabla[i][1];
            System.out.println("Total ventas del producto "+(i+1)+": "+t_producto);
        }
    }

    public void determinar_mayor_exito_ventas(){
        int t_producto_1 = this.tabla[0][0] + this.tabla[0][1];
        int t_producto_2 = this.tabla[1][0] + this.tabla[1][1];
        int t_producto_3 = this.tabla[2][0] + this.tabla[2][1];

        if (t_producto_1 > t_producto_2 && t_producto_1 > t_producto_3){
            System.out.println("El producto mas vendido es el producto 1 con: "+t_producto_1+" ventas");
        } else if (t_producto_2 > t_producto_3 && t_producto_2 > t_producto_1){
            System.out.println("El producto mas vendido es el producto 2 con: "+t_producto_2+" ventas");
        } else if (t_producto_3 > t_producto_1 && t_producto_3 > t_producto_2){
            System.out.println("El producto mas vendido es el producto 3 con: "+t_producto_3+" ventas");
        } else{
            System.out.println("Los productos tienen el mismo numero de ventas");
        }
    }
}
