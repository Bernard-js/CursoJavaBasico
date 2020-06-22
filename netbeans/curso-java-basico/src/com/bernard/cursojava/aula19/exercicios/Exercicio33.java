package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10]; 
        boolean isPrime = true;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
        }
        
        
        for (int i = 0; i < vA.length; i++) {
            
            for (int j = 2; j < vA[i]; j++) {
                if (vA[i] % j == 0) {
                    isPrime = false;
                }
            }
            
            if (isPrime) {
                System.out.println(vA[i] + " é primo");
            } else {
                System.out.println(vA[i] + " não é primo");                  
            }
        }
    }
}
