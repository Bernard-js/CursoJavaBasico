package com.bernard.cursojava.aula27.exercicios;

public class Exer01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        System.out.println(lampada.acesa);
        
        lampada.ligar();
        System.out.println(lampada.acesa);
        
        lampada.desligar();
        System.out.println(lampada.acesa);
    }
}
