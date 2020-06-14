package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas provas você fez?");
        int numPessoas = scanner.nextInt();
        
        double soma = 0;
        double idade;
        double mediaIdade;
        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Escreva sua nota: ");
            idade = scanner.nextDouble();
            soma += idade;
        }
        
        mediaIdade = soma / numPessoas;
        
        if (mediaIdade > 0 && mediaIdade <= 25) {
            System.out.println("Grupo de pessoas jovens");
        } else if (mediaIdade <= 60){
            System.out.println("Grupo de pessoas adultas");
        } else {
            System.out.println("Grupo de pessoas idosas");
        }
    }
}

