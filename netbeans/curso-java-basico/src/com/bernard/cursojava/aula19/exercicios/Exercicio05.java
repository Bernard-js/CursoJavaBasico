package com.bernard.cursojava.aula19.exercicios;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] vA = new int[10];
            
        for (int i = 0; i < vA.length; i++) {
            vA[i] = i * 2 + 1;
            System.out.println(vA[i]);
        }
        
        int[] vB = new int[10];
        
        for (int i = 0; i < vB.length; i++){
            vB[i] = vA[i] * i;
            System.out.println(vB[i]);
        }
    }
}
