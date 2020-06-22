package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int somaMenor = 0;
        int numEquals15 = 0;
        double mediaMaior = 0;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("digite um inteiro para o elemento da posição " + i);
            vA[i] = scanner.nextInt();
            if (vA[i] < 15) {
                somaMenor += vA[i];
            } else if (vA[i] == 15){
                numEquals15++;
            } else {
                mediaMaior += vA[i];
            }
        }
        
        mediaMaior = mediaMaior / 2;
        
        System.out.println(somaMenor);
        System.out.println(numEquals15);
        System.out.println(mediaMaior);
    }
}
