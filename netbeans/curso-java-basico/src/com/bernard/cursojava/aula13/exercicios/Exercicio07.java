package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva o lado do quadrado: ");
        float ladoQuadrado = scan.nextFloat();
        
        float areaQuadrado = ladoQuadrado * ladoQuadrado;
        float dobroAreaQuadrado = areaQuadrado * 2;
        
        System.out.println("o dobro da area do quadrado: " + dobroAreaQuadrado);
    }
}

