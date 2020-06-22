package com.bernard.cursojava.aula19.exercicios;

public class Exercicio37 {
    public static void main(String[] args) {
        int[] vA = new int[15];
        long[] vB = new long[vA.length];
        long fatorial;
        
        for (int i = 0; i < vA.length; i++) {
            vA[i] = i;
        }
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vB.length; i++) {
            fatorial = 1;
            for (int j = 1; j < vA[i]; j++) {
                fatorial = fatorial * j;
            }
            vB[i] = fatorial;
            System.out.println(vB[i] + ", ");
        }
    }
}
