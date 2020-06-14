
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número entre 1 e 10");
        byte tabuada = scanner.nextByte();
        
        System.out.println("Tabuada de " + tabuada + ": ");
        
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }
                
    }
}
