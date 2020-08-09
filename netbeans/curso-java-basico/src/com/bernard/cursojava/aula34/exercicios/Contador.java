package com.bernard.cursojava.aula34.exercicios;

public class Contador {
    private static int contador;

    public Contador() {
        Contador.contador++;
    }
    
    public static void zerar(){
        Contador.contador = 0;
    }
    
    public static void incrementar(){
        Contador.contador++;
    }
    
    public static int getContador() {
        return contador;
    }
    
}
