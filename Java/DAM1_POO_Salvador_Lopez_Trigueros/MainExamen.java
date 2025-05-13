public class MainExamen {
    public static void main(String[] args) {

        //Main Fracciones

        Fraccion f1 = new Fraccion(1,4);
        Fraccion f2 = new Fraccion(1,2);
        Fraccion f3 = new Fraccion();
        Fraccion f4 = new Fraccion(4);


        Fraccion suma =  f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);

        System.out.println(f1 + " + " + f2 + " = " + suma );
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);

        System.out.println("\n ---------------------------------------- \n");
        //Main Simplificcion de Fracciones

        FraccionSimplificada sumaSimp =  new FraccionSimplificada(suma.getNumerador(), suma.getDenominador());
        FraccionSimplificada restaSimp = new FraccionSimplificada(resta.getNumerador(), resta.getDenominador());
        FraccionSimplificada productoSimp = new FraccionSimplificada(producto.getNumerador(), producto.getDenominador());
        FraccionSimplificada cocienteSimp = new FraccionSimplificada(cociente.getNumerador(), cociente.getDenominador());
        FraccionSimplificada seisdos = new FraccionSimplificada(6,2);

        System.out.println(f1 + " + " + f2 + " = " + sumaSimp.simplificar());
        System.out.println(f1 + " - " + f3 + " = " + restaSimp.simplificar());
        System.out.println(f1 + " * " + f4 + " = " + productoSimp.simplificar());
        System.out.println(f1 + " / " + f2 + " = " + cocienteSimp.simplificar());
        System.out.println("\n Muestro una fraccion: "+seisdos+" y ahora la simplifico obteniendo: "+seisdos.simplificar());

        
    }
}
