package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int habA;
        double crescA;
        int habB;
        double crescB;
        boolean valid = false;
        
        while (!valid) { 
            System.out.println("informe o número de habitantes da população A: ");
            habA = scanner.nextInt();
            System.out.println("agora informe o crescimento percentual desta população por ano: ");
            crescA = scanner.nextDouble();

            System.out.println("informe o número de habitantes da população B: ");
            habB = scanner.nextInt();
            System.out.println("agora informe o crescimento percentual desta população por ano: ");
            crescB = scanner.nextDouble();
            
            if (crescA < 0 || crescB < 0 || crescA > 100 || crescB > 100){
            System.out.println("Esreva o crescimento percentual como um número de 0 até 100");
            }else if(habA < 0 || habB < 0){
                System.out.println("é ímpossível o número de habitantes de uma população ser negativa");
            } else {
                valid = true;
                if (habA > habB && crescA < crescB){
                    int i = 0;
                    do {
                        habA += crescA * habA / 100;
                        habB += habB * crescB / 100;
                        i += 1;
                    } while (habA > habB);
                    System.out.println("quantiade de anos: " + i);
                } else if (habA < habB && crescA > crescB){
                    int i = 0;
                    do {
                        habA += crescA * habA / 100;
                        habB += habB * crescB / 100;
                        i += 1;
                    } while (habA < habB);
                    System.out.println("quantidade de anos: " + i);
                } else if (habA > habB && crescA > crescB){
                    System.out.println("A população de B nunca irá ultrapassar a população de A");
                } else {
                    System.out.println("A população de B nunca irá ultrapassar a população de A");
                }
            }
        }
    }
}