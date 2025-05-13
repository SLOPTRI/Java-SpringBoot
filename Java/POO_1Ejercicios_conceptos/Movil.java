package Ejercicios1POO;

public class Movil extends Terminal{
    private String tarifa;
    private double dinerito;

    public Movil(String n, String t) {
        super(n);
        this.tarifa = t;
    }
    @Override
    public void llama(Terminal t, int s){
        super.llama(t, s);
        double tiempo = (double) s/60;
        if(this.tarifa == "rata"){
            this.dinerito += tiempo*0.06;
        }else if(this.tarifa=="mono"){
            this.dinerito += tiempo*0.12;
        }else if(this.tarifa=="bisonte"){
            this.dinerito += tiempo*0.30;
        }
    }
    public String toString(){
        String caracola = ("N. "+this.n+" "+this.tiempo+"s de conversacion"+" - Tarificados "+this.dinerito+" euros");
        return caracola;
    }
    public static void main(String[] args){
        Movil m1 = new Movil("678 11 22 33", "rata");
        Movil m2 = new Movil("644 74 44 69", "mono");
        Movil m3 = new Movil("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

}
