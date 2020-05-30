package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas você trabalha por dia?");
        int horas = scanner.nextInt();

        System.out.println("Qual o seu salário bruto por hora trabalhada?");
        double salarioHora = scanner.nextDouble();

        double salarioBruto = horas * salarioHora * 5 * 4;
        double fgts = 11 * salarioBruto / 100;
        double sindicato = 3 * salarioBruto / 100;
        double impostoRenda = 0;

        if (salarioBruto <= 1500 && salarioBruto >= 900){
            impostoRenda = 5 * salarioBruto / 100;
        } else if (salarioBruto <= 2500 ){
            impostoRenda = 10 * salarioBruto / 100;
        } else if (salarioBruto > 2500){
            impostoRenda = 20 * salarioBruto / 100;
        }

        double descontos =  impostoRenda + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário bruto:           R$" + salarioBruto);
        System.out.println("Imposto de renda:        R$" + impostoRenda);
        System.out.println("Sindicato:               R$" + sindicato);
        System.out.println("FGTS:                    R$" + fgts);
        System.out.println("Total de descontos:      R$" + descontos);
        System.out.println("Salário Líquido:         R$" + salarioLiquido);

    }
}
