package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a temperatura atual em graus celcius?");
        double grausCelcius = scan.nextDouble();
        
        double grausFarenheit = grausCelcius * 9 / 5 + 32;
        System.out.println("a temperatura em graus farenheit: " + grausFarenheit);
    }
}

