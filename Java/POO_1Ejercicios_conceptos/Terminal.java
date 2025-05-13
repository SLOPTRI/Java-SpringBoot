package Ejercicios1POO;

public class Terminal {
    protected String n;
    int tiempo;

    public Terminal(String n) {
        this.n = n;
        this.tiempo = 0;
    }
    public String toString(){
        String caracola = ("N. "+this.n+" "+this.tiempo+"s");
        return caracola;
    }
    public void llama(Terminal t, int s){
        this.tiempo += s;
        t.tiempo += s;
    }
    public int getTiempo(){
        return this.tiempo;
    }

    public static void main(String[] args){
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
