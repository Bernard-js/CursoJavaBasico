
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean invalido = true;
        
        while (invalido) {            
            System.out.println("Escreva uma nota entre 0 e 10: ");
            double nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                invalido = false;
                System.out.println("Sua nota foi: " + nota);
            } else {
                System.out.println("Nota inválida! tente novamente.");
            }
        }
    }
}
