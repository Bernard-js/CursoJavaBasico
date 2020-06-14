package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio29 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número inteiro");
        int n = scanner.nextInt();

        for (int j = 2; j < n; j++) {
            boolean isPrime = true;
            int i = 2;
        
            while(isPrime && i < j){
                if (j % i == 0){
                    System.out.println(j + " não é primo!");
                    isPrime = false;
                }
                i++;
            }
            
            if (isPrime){
                System.out.println(j + " é primo!");
            }
        }
    }
}