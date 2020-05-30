package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva a altura em metros: ");
        double heightInMeters = scan.nextDouble();
        
        double heightInCentimeters = heightInMeters * 100;
        System.out.println("Altura em centimetros: " + heightInCentimeters);
    }
}

