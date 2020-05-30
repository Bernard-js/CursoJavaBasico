package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a temperatura atual em graus Farenheit? ");
        float grausFarenheit = scan.nextFloat();
        
        float grausCelsius = (grausFarenheit - 32) * 5 / 9;
        System.out.println("A temperatura em graus celsius: " + grausCelsius);
    }
}

