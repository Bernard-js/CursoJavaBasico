package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva o tamanho do seu arquivo em MB: ");
        short tamanhoArquivo = scan.nextShort();
        
        System.out.println("Escreva a velocidade da conexao de sua internet em Mbps: ");
        float velocidadeConexao = scan.nextFloat();
        
        float tempoDownload = tamanhoArquivo * 8 / velocidadeConexao / 60 ;
        System.out.println("tempo de download: " + tempoDownload + "min");
    }
}

