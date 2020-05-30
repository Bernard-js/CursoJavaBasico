package com.bernard.cursojava.aula16;

public class LoopDoWhile {
    public static void main(String[] args) {

        int i = 1; //iterador

        int max = 10;

        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i <= max);

        System.out.println(i);
    }
}
