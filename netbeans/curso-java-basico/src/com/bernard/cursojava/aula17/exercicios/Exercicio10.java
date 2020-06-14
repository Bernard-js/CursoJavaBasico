package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        int a = scanner.nextInt();
        
        System.out.println("Escreva outro número: ");
        int b = scanner.nextInt();
        
        if (b > a) {
            
            a = a + 1;
            
            while (a < b) {
                System.out.println(a);
                a++;
            }
        } else if (a > b) {
            b = b + 1;
            
            while (b < a) {
                System.out.println(b);
                b++;
            }
        } else {
            System.out.println("Não existem números no intervalo entre eles");
        }
        
    }
}

