package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("Faremos perguntas sobre um crime. responda sim ou não");

        System.out.println("Telefonou para a vítima?");
        String perqunta1 = scanner.next();
        boolean resposta1 = false;
        if (perqunta1.equalsIgnoreCase("sim")) resposta1 = true;
        if (resposta1) num++;

        System.out.println("Esteve no local do crime?");
        String perqunta2 = scanner.next();
        boolean resposta2 = false;
        if (perqunta2.equalsIgnoreCase("sim")) resposta2 = true;
        if (resposta2) num++;

        System.out.println("Mora perto da vítima?");
        String perqunta3 = scanner.next();
        boolean resposta3 = false;
        if (perqunta3.equalsIgnoreCase("sim")) resposta3 = true;
        if (resposta3) num++;

        System.out.println("Devia para a vítima?");
        String perqunta4 = scanner.next();
        boolean resposta4 = false;
        if (perqunta4.equalsIgnoreCase("sim")) resposta4 = true;
        if (resposta4) num++;

        System.out.println("Já trabalhou para a vítima?");
        String perqunta5 = scanner.next();
        boolean resposta5 = false;
        if (perqunta5.equalsIgnoreCase("sim")) resposta5 = true;
        if (resposta5) num++;


        if ((!perqunta1.equalsIgnoreCase("sim") && !perqunta1.equalsIgnoreCase("não"))
                || (!perqunta2.equalsIgnoreCase("sim") && !perqunta2.equalsIgnoreCase("não"))
                || (!perqunta3.equalsIgnoreCase("sim") && !perqunta3.equalsIgnoreCase("não"))
                || (!perqunta4.equalsIgnoreCase("sim") && !perqunta4.equalsIgnoreCase("não"))
                || (!perqunta5.equalsIgnoreCase("sim") && !perqunta5.equalsIgnoreCase("não"))){
            System.out.println("Responda sim ou não!");
        } else if (num == 2){
            System.out.println("Você é suspeito");
        } else if (num >= 3 && num <= 4){
            System.out.println("Você é cúmplice");
        } else if (num == 5){
            System.out.println("Você é o assassino");
        } else {
            System.out.println("Você é inocente");
        }
    }
}
