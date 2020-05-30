package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Salario por hora: ");
        double salarioHora = scan.nextDouble();
        
        System.out.println("Horas trabalhadas em um mes: ");
        byte horasTrabalhadas = scan.nextByte();
        
        double salarioMensal = salarioHora * horasTrabalhadas;
        System.out.println("Seu salario mensal: " + salarioMensal);
    }
}

