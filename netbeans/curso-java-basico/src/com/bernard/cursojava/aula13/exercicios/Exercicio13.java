package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Salario por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Horas trabalhadas em um mes: ");
        byte horasTrabalhadas = scan.nextByte();
        
        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = salarioBruto * 8 / 100 ;
        double impostoRenda = salarioBruto * 11 / 100 ;
        double sindicato = salarioBruto * 5 / 100 ;
        double salarioLiquido = salarioBruto - inss - impostoRenda - sindicato ;
        
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Valor descontado pelo INSS: " + inss);
        System.out.println("Valor descontado pelo sindicato: " + sindicato);
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}

