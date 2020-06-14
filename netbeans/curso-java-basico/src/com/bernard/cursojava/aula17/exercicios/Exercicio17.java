package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro: ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        int mult;
        for (int i = 0; i < n; i++) {
            mult = i + 1;
            factorial *= mult;
        }
        System.out.println(n + "! = " + factorial);
    }
}

