package com.bernard.cursojava.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai entrevistar?");
        int numEntrevistados = scanner.nextInt();
        
        String[][] entrevistados = new String[numEntrevistados][];
        
        int numFilhos;
        for (int i = 0; i < entrevistados.length; i++) {
            System.out.println("Quantos filhos o entrevistado " + (i + 1) + " possui?");
            numFilhos = scanner.nextInt();
            
            entrevistados[i] = new String[numFilhos];
            
            for (int j = 0; j < entrevistados[i].length; j++) {
                System.out.println("Qual o nome do filho " + (j + 1) + " do entrevistado " + (i + 1) + " ?");
                entrevistados[i][j] = scanner.next();
            }
        }
        
         for (int i = 0; i < entrevistados.length; i++){
             System.out.println("A pessoa " + (i + 1) + " possui " + entrevistados[i].length + " filhos.");
             for (int j = 0; j < entrevistados[i].length; j++){
                 System.out.println("Filho " + (j + 1) + ": " + entrevistados[i][j]);
             }
         }
    }
}
