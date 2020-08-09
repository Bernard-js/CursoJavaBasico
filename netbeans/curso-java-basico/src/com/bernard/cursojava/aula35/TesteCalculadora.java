package com.bernard.cursojava.aula35;

public class TesteCalculadora {
    public static void main(String[] args) {
        long fatorialNR = Calculadora.fatorialNaoRecursivo(7);
        long fatorialR = Calculadora.fatorial(7);
        
        System.out.println(fatorialNR);
        System.out.println(fatorialR);
    }
}
