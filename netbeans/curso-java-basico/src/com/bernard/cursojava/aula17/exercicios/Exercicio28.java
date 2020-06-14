package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número inteiro");
        int n = scanner.nextInt();

        boolean isPrime = true;
        int i = 2;
        
        while(isPrime && i < n){
            if (n % i == 0){
                System.out.println(n + " não é primo!");
                isPrime = false;
            }
            i++;
        }
        
        if (isPrime){
            System.out.println(n + " é primo");
        }
    }
}