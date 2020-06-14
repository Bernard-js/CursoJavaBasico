package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio19 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas provas você fez?");
        int numProvas = scanner.nextInt();
        
        double soma = 0;
        double nota;
        double media;
        
        for (int i = 0; i < numProvas; i++) {
            System.out.println("Escreva sua nota: ");
            nota = scanner.nextDouble();
            soma += nota;
        }
        
        media = soma / numProvas;
        System.out.println("A média das notas é: " + media);
    }
}

