package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("quanto está a cotação do dólar hoje?");
        double dolar = scanner.nextDouble();
        
        double[] valores = new double[20];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = dolar * (i + 1);
            if (i == 0) {
                System.out.println((i + 1) + " dólar = " + valores[i] + "Real");
            } else {            
                System.out.println((i + 1) + " dólares = " + valores[i] + "Reais");
            }
        }     
    }
}
