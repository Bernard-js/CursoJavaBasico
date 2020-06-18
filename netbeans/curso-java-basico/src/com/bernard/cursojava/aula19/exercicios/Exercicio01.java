package com.bernard.cursojava.aula19.exercicios;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int[] vetorA = new int[5];
        
        vetorA[0] = 3;
        vetorA[1] = 4;
        vetorA[2] = 21;
        vetorA[3] = 71;
        vetorA[4] = 30;
        
        int[] vetorB = new int[5];
        
        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i];
        }
        
        
    }
}

