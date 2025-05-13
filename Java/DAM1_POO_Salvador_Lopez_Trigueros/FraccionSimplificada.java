public class FraccionSimplificada extends Fraccion {

    public FraccionSimplificada(int numerador, int denominador) {
        super(numerador, denominador);
    }

    public Fraccion simplificar() {
        Fraccion resultado = new Fraccion();

        int m = mcd();

        do{
            resultado.setNumerador(this.numerador/m);
            resultado.setDenominador(this.denominador/m);
        }while(this.numerador % m > 0);

        return resultado;
    }

    private int mcd(){

        int u = Math.abs(this.numerador);
        int v = Math.abs(this.denominador);

        while(v != 0){
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

}
