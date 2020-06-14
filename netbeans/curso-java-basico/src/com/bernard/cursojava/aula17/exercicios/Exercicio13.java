
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro positivo: ");
        int expoente = scanner.nextInt();
        
        System.out.println("Escreva um número qualquer: ");
        double base = scanner.nextDouble();
        
        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        
        System.out.println(base + " elevado á " + expoente + " = " + resultado);
    }
}
