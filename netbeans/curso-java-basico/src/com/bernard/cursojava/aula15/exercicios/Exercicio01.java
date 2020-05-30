package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num1 = scan.nextInt();

        System.out.println("Escreva outro número: ");
        int num2 = scan.nextInt();

        if (num1 >= num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
