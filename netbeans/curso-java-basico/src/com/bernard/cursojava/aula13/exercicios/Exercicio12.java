package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva a sua altura em metros: ");
        float altura = scan.nextFloat();
        
        float pesoIdeal = (altura * 72.7f) - 58;
        System.out.println("seu peso ideal: " + pesoIdeal + "kg");
    }
}

