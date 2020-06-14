package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos cds voce tem?");
        int cds = scanner.nextInt();
        
        int soma = 0;
        double media = 0;
        double precoCd;
        for (int i = 0; i < cds; i++) {
            System.out.println("Qual o preço deste cd?");
            precoCd = scanner.nextDouble();
            soma += precoCd;
        }
        media = soma / cds;
        System.out.println("A média de preços da sua coleção: " + media);
    }
}
