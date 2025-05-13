package Figuras;

public class Main {
    public static void main(String[] args) {
        Superheroe IronMan = new Superheroe("IronMan");
        IronMan.setDescripcion("El mejor vengador de la historia");

        Superheroe Thor = new Superheroe("Thor");
        Thor.setDescripcion("Rayo para rayo");
        Thor.setCapa(true);

        Superheroe BatMan = new Superheroe("BatMan");
        BatMan.setCapa(true);
        Superheroe Rayo = new Superheroe("El hombre murcielago");

        Dimension small = new Dimension(15,5,2);
        Dimension large = new Dimension(25,25,2);

        Figura Iron = new Figura("ae32",30,small,IronMan);
        Figura Bat = new Figura("ae33",30,small,BatMan);
        Figura Tho = new Figura("ae34",30,large,Thor);

        Coleccion Vengadores = new Coleccion("Marvel");
        Vengadores.agregarFigura(Iron);
        Vengadores.agregarFigura(Bat);
        Vengadores.agregarFigura(Tho);

        System.out.println(Vengadores.conCapa());
    }
}
