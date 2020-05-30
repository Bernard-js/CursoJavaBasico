package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o raio do círculo: ");
        double raioCirculo = scan.nextDouble();
        
        double areaCirculo = Math.PI * raioCirculo * raioCirculo;
        System.out.println("A area do circulo: " + areaCirculo);
    }
}

