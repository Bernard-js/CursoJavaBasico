package com.bernard.cursojava.aula47;

public class Execoes {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da execao");

            System.out.println(vetor[4]);
        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("o array possui apenas 4 posições");
            
        }

        System.out.println("Este código será executado após a exception");
        
        
    }
}
