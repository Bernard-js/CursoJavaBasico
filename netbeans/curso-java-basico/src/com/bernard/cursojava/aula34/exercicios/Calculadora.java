package com.bernard.cursojava.aula34.exercicios;

public class Calculadora {
    public static double somar(double d1, double d2){
        return d1 + d2;
    }
    
    public static double subtrair(double d1, double d2){
        System.out.println("Este método retornará "
                + "o módulo da subtração entre os dois números.");
        if (d1 > d2) {
            return d1 - d2;
        } else {
            return d2 - d1;
        }
    }
    
    public static double multiplicar(double d1, double d2){
        return d1 * d2;
    }
    
    public static double dividir(double d1, double d2){
        System.out.println("Este método retornará "
                + "a divisão do maior pelo menor número.");
        if (d1 > d2) {
            return d1 / d2;
        } else {
            return d2 / d1;
        }
    }
    
    public static double potencia(double num, int n){
        double resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado = resultado * num;
        }
        return resultado;
    }
    
    public static long fatorial(int n){
        int n0 = 1;
        for (int i = 1; i <= n; i++) {
            n0 = n0 * i;
        }
        return n0;
    }
}
