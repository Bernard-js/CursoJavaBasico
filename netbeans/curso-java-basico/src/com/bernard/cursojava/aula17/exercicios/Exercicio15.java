package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o ultimo termo da sequencia: ");
        int n = scanner.nextInt();
        
        int fib1 = 0;
        int fib2 = 1;
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Fibonacci " + i + " = " + resultado);
            resultado = fib1 + fib2;
            fib1 = fib2;
            fib2 = resultado;
        }
    }
}
