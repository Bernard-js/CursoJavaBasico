package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Você irá escrever  5 números e aparecerá na tela a média e a soma");
        
        int soma = 0;
        double media;
        for (int i = 0; i < 5; i++) {
            System.out.println("escreva qualquer número inteiro");
            int num = scanner.nextInt();
            soma += num;
        }
        
        media = soma / 5;
        
        System.out.println("A soma: " + soma);
        System.out.println("A média: " + media);
        
    }
}

