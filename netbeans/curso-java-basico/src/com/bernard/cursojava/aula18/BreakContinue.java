package com.bernard.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int num = scanner.nextInt();

        System.out.println("Entre com um limite");
        int limite = scanner.nextInt();

        for (int i = num; i < limite; i++) {

            if (i % 7 == 0){
                System.out.println("primeiro número da sequência divisível por 7: " + i);
                break;
            }
        }

        for (int i = 0; i <= 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }
                        if (i == 3){
                            break rotulo3;
                        }
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }


        System.out.println("Entre com um número inteiro");
        int num2 = scanner.nextInt();

        System.out.println("Entre com um limite");
        int limite2 = scanner.nextInt();

        for (int i = num2; i < limite2; i++) {

            if (i % 7 == 0){
                System.out.println("primeiro número da sequência divisível por 7: " + i);
                continue;
            }
        }
    }
}
