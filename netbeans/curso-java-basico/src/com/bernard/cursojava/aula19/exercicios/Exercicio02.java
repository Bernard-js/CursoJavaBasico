package com.bernard.cursojava.aula19.exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        
        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 4;
            System.out.println(numeros[i]);
        }
        
        int[] numeros2 = new int[8];
        
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = numeros[i] * 2;
            System.out.println(numeros2[i]);
        }
        
        
    }
}
