package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        int menorNum = Integer.MAX_VALUE;
        int maiorNum = Integer.MIN_VALUE;
        int menorPos = 0;
        int maiorPos = 0;
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Escreva a idade da pessoa " + (i + 1));
            idades[i] = scanner.nextInt();
            
            if (idades[i] < menorNum) {
                menorNum = idades[i];
                menorPos = i + 1;
            }
            
            if (idades[i] > maiorNum) {
                maiorNum = idades[i];
                maiorPos = i + 1;
            }
        }
        
        System.out.println("Menor Idade: " + menorNum + " Posição: " + menorPos);
        System.out.println("Maior Idade: " + maiorNum + " Posição: " + maiorPos);
    }
}
