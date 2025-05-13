public class main {
    public static void main(String[] args) {
        Ventas ventas = new Ventas();
        ventas.agregar();
        System.out.println(ventas);
        ventas.total_ventas();
        ventas.determinar_mayor_exito_ventas();
    }
}
