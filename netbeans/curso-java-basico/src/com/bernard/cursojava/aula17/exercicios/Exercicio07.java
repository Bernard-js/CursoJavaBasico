package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Você irá escrever  5 números e aparecerá na tela qual é o maior");
        
        int num;
        int maior = Integer.MIN_VALUE;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("escreva qualquer número inteiro");
            num = scanner.nextInt();
            
            if (num > maior) {
                maior = num; 
            }
        }
        System.out.println("o maior número digitado foi: " + maior);
    }
    
}
