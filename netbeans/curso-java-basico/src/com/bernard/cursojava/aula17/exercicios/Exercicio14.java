package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("escreva 10 numeros inteiros e diremos quais são pares e quais são ímpares");
        
        int par = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva um número inteiro: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                par++;
            }
        }
        int impar = 10 - par;

        System.out.println("Números ímpares: " + impar);
        System.out.println("Números pares: " + par);
    }
}

