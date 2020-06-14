package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o seu salário inicial: ");
        double salarioInicial = scanner.nextDouble();
        
        double aumentoPercentual =  1.5 / 100;
        double aumento;
        int ano = 1996;

        while(ano < 2020){
            aumento = aumentoPercentual * salarioInicial;
            salarioInicial += aumento;
            aumentoPercentual *= 2;
            ano++;
        }
    }
}