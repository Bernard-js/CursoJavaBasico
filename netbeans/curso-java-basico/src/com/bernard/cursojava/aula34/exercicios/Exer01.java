package com.bernard.cursojava.aula34.exercicios;

public class Exer01 {
    public static void main(String[] args) {
        System.out.println(Contador.getContador());
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        System.out.println(Contador.getContador());
        
        Contador.zerar();
        System.out.println(Contador.getContador());
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        System.out.println(Contador.getContador());

    }
}
