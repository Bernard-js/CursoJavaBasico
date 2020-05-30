package com.bernard.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1; //iterador, count

        int max = 10; // valor máximo

        System.out.println("Contando até " + max);

        while (i <= max){

            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println(i);
    }
}
