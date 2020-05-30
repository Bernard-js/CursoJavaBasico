package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    private static double pow(float real, int i) {
        float exponencial = 1;
        while (i >= 1) {            
            exponencial *= real;
            i-- ;
        }
        return exponencial ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um numero inteiro: ");
        int primeiroInteiro = scan.nextInt();
        System.out.println("Escreva outro numero inteiro: ");
        long segundoInteiro = scan.nextLong();
        System.out.println("Escreva um numero real: ");
        float real = scan.nextFloat();
        
        long resultado1 = 2 * primeiroInteiro * segundoInteiro / 2 ;
        float resultado2 = 3 * primeiroInteiro + real ;
        double resultado3 = pow(real, 3);
        
        System.out.println("Resultados: ");
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}

