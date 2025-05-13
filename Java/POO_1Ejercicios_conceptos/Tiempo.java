package Ejercicios1POO;

import java.util.ArrayList;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public int getHora() {
        return hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }

    public int seg(Tiempo tiempo) {
        hora = tiempo.getHora();
        minutos = tiempo.getMinutos();
        segundos = tiempo.getSegundos();
        while(hora!=0){
            hora--;
            minutos+= 60;
        }
        while (minutos != 0) {
            minutos--;
            segundos+= 60;
        }
        return segundos;
    }

    public int conversion(int seg){
        while(seg >= 60){
            this.minutos++;
            seg-=60;
        } while (this.minutos >= 60){
            this.hora++;
            this.minutos-=60;
        }
        return seg;
    }

    public StringBuilder sumar(Tiempo tiempo1, Tiempo tiempo2) {
        StringBuilder res = new StringBuilder();
        int seg = seg(tiempo1) + seg(tiempo2);
        conversion(seg);
        res.append(hora).append("h").append(":").append(minutos).append("m").append(":").append(conversion(seg)).append("s");
        return res;
    }
    public StringBuilder restar(Tiempo tiempo1, Tiempo tiempo2) {
        StringBuilder res = new StringBuilder();
        int seg = seg(tiempo1) - seg(tiempo2);
        conversion(seg);
        res.append(hora).append("h").append(":").append(minutos).append("m").append(":").append(conversion(seg)).append("s");
        return res;
    }

    public static void main(String[] args) {
        Tiempo hora1 = new Tiempo(0,30,40);
        Tiempo hora2 = new Tiempo(0,35,20);
        System.out.println(hora1.sumar(hora1, hora2));
    }
}
