public class Fraccion {

    protected int numerador;
    protected int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion fraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(this.numerador * fraccion.getDenominador() + fraccion.getNumerador() * this.denominador);
        resultado.setDenominador(this.denominador * fraccion.getDenominador());
        cero(resultado);
        return resultado;
    }

    public Fraccion restar(Fraccion fraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(this.numerador * fraccion.getDenominador() - fraccion.getNumerador() * this.denominador);
        resultado.setDenominador(this.denominador * fraccion.getDenominador());
        cero(resultado);
        return resultado;
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(this.numerador * fraccion.getNumerador());
        resultado.setDenominador(this.denominador * fraccion.getDenominador());
        cero(resultado);
        return resultado;
    }

    public Fraccion dividir(Fraccion fraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(this.numerador * fraccion.getDenominador());
        resultado.setDenominador(this.denominador * fraccion.getNumerador());
        cero(resultado);
        return resultado;
    }

    public void cero(Fraccion x){
        if(x.getNumerador() == 0){
            x.setNumerador(1);
        }
    }

    public String toString() {

        return numerador + "/" + denominador;

    }
}
