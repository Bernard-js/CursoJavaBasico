package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int soma = 0;
        int numPar = 0;
        float fLength = (float) vA.length;
        double percentualPar;
        double percentualImpar;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
            if (vA[i] % 2 != 0) {
                numPar++;
            }
        }
        
        percentualPar = numPar / fLength;
        percentualImpar = 1 - percentualPar;
        
        System.out.println(percentualPar);
        System.out.println(percentualImpar);
        
    }
}
