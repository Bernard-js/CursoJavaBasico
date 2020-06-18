package com.bernard.cursojava.aula19.exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        
        int[] vA = new int[15];
            
        for (int i = 0; i < vA.length; i++) {
            vA[i] = i * 2 + 1;
            System.out.println(vA[i]);
        }
        
        double[] vB = new double[15];
        
        for (int i = 0; i < vB.length; i++){
            vB[i] = Math.sqrt(vA[i]);
            System.out.println(vB[i]);
        }
    }
}
