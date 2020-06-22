package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] randomArray = new int[10];
        double num0 = 0;
        double num1 = 0;
        double perc0;
        double perc1;

        for (int i = 0; i < randomArray.length; i += 1) {
            randomArray[i] = (int) Math.round(Math.random() * 1);
            if (randomArray[i] == 0) {
                num0 += 1;
            } else if (randomArray[i] == 1) {
                num1 += 1;
            }
        }
        perc0 = num0 / 10;
        perc1 = num1 / 10;

        System.out.println(perc0);
        System.out.println(perc1);
    }
}
