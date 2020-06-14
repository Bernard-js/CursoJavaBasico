
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        int a = scanner.nextInt();
        
        System.out.println("Escreva outro número: ");
        int b = scanner.nextInt();
        
        if (b > a) {
            
            a = a + 1;
            int soma = 0;
            while (a < b) {
                System.out.println(a);
                soma += a;
                a++;
            }
            System.out.println("soma dos números: " + soma);
        } else if (a > b) {
            b = b + 1;
            int soma = 0;
            while (b < a) {
                System.out.println(b);
                soma += b;
                b++;
            }
            System.out.println("soma dos números: " + soma);
        } else {
            System.out.println("Não existem números no intervalo entre eles");
        }
        
    }
}
