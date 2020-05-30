package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dê os três coeficientes (a, b e c) de uma equação do segundo grau: ");
        short a = scanner.nextShort();
        short b = scanner.nextShort();
        short c = scanner.nextShort();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau!");
        } else {
            double delta = pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("As raízes não pertencem ao conjunto dos reais.");
            } else if (delta == 0){
                double raiz  = -b / (2 * a);
                System.out.println("nesta equação só existe uma raiz: " + raiz);
            } else {
                double raiz1 = (-b + sqrt(delta)) / (2 * a);
                double raiz2 = (-b - sqrt(delta)) / (2 * a);

                System.out.println("esta equação possui duas raizes: " + raiz1 + " e " + raiz2);
            }
        }

    }
}
