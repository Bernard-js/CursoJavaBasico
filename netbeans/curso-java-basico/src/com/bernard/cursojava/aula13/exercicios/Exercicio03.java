package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scan.nextInt();
        
        int soma = numero1 + numero2;
        System.out.println("A soma dos dois numeros informados: " + soma);
    }
}

