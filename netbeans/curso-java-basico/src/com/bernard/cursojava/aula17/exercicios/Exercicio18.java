package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro: ");
        int n = scanner.nextInt();
        int primeCounter = 0;
        for (int i = 2; i < n; i++) {
            if(n % i != 0){
                primeCounter++;
            }
        }
        if (primeCounter == (n - 2)) {
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }
    }
}

