package com.bernard.cursojava.aula33.exercicios;

public class Exer01 {
    public static void main(String[] args) {
        Lampada l = new Lampada("Phillips", "LED", 40);
        
        l.setPreco(20.00);
        System.out.println(l.getPreco());
        
        System.out.println(l.isAcesa());
        l.ligar();
        System.out.println(l.isAcesa());
        l.desligar();
        System.out.println(l.isAcesa());
    }
}
