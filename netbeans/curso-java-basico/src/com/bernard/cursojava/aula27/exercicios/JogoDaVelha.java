package com.bernard.cursojava.aula27.exercicios;

import java.util.Scanner;

public class JogoDaVelha {
    
    String[][] jogoDaVelha;
    Scanner scanner;
    boolean sairJogo = false;
    String sairJogoString;
    boolean fimJogo;
    int linha;
    int coluna;
    int numJogada;
    String jogada;

    
    void rodarJogo(){
        scanner = new Scanner(System.in);         
        jogoDaVelha = new String[3][3];
        
        while (!sairJogo) {

            System.out.println("Você deseja jogar outra partida?(S/N)");
            sairJogoString = scanner.next();

            if (sairJogoString.equalsIgnoreCase("S")) {
                jogar();
            } else {
                sairJogo = true;
            }
        }
    }
    
    void jogar(){
        fimJogo = false;
        
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha.length; j++) {
                jogoDaVelha[i][j] = "-";
            }
        }

        System.out.println();
        System.out.println("O jogador 1 será o 'X' e o jogador 2 será o 'O' ");
        System.out.println();
        numJogada = 0;

        while (!fimJogo && numJogada < 9) {

            if (numJogada % 2 == 0) {
                System.out.println("Agora é a vez do jogador 1");
                jogada = "X";
            } else {
                System.out.println("Agora é a vez do jogador 2");
                jogada = "O";
            }
            System.out.println("escolha a linha que voce quer jogar (1 - 3): ");
            linha = scanner.nextInt();

            System.out.println("agora escolha a coluna (1 - 3): ");
            coluna = scanner.nextInt();
            
            //Validar Jogada
            validarJogada();
            // Regra do Jogo
            analisarJogo();
            numJogada++;
        }
        if (numJogada == 9 && !fimJogo) {
            System.out.println("Deu Velha!");
        }
    }
    
    void validarJogada(){
        if (linha < 1 || linha > 3) {
                System.out.println("Linha inválida! tente novamente");
                numJogada--;
            } else if (coluna < 1 || coluna > 3) {
                System.out.println("Coluna invalida! tente novamente");
                numJogada--;
            } else if (!jogoDaVelha[linha - 1][coluna - 1].equals("-")) {
                System.out.println("Esta posição já está ocupada.");
                numJogada--;
            } else {
                jogoDaVelha[linha - 1][coluna - 1] = jogada;
                System.out.println("Tabuleiro: ");

                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        System.out.print(jogoDaVelha[i][j] + " ");
                    }
                    System.out.println();
                }
            }
    }
    
    void analisarJogo(){
        // Regra do Jogo
        for (int i = 0; i < jogoDaVelha.length; i++) {
            if (jogoDaVelha[i][0].equals(jogoDaVelha[i][1]) && jogoDaVelha[i][0].equals(jogoDaVelha[i][2])) {
                if (!jogoDaVelha[i][0].equals("-")) {
                    fimJogo = true;
                    if (jogoDaVelha[i][0].equals("X")) {
                        System.out.println("Fim do Jogo! o jogador 1 venceu! linha - " + (i + 1));
                    }
                    if (jogoDaVelha[i][0].equals("O")) {
                        System.out.println("Fim do Jogo! o jogador 2 venceu! linha - " + (i + 1));
                    }
                }
            }
            if (jogoDaVelha[0][i].equals(jogoDaVelha[1][i]) && jogoDaVelha[0][i].equals(jogoDaVelha[2][i])) {
                if (!jogoDaVelha[0][i].equals("-")) {
                    fimJogo = true;
                    if (jogoDaVelha[0][i].equals("X")) {
                        System.out.println("Fim do Jogo! o jogador 1 venceu! coluna - " + (i + 1));
                    }
                    if (jogoDaVelha[0][i].equals("O")) {
                        System.out.println("Fim do Jogo! o jogador 2 venceu! coluna - " + (i + 1));
                    }
                }
            }

        }

        if (jogoDaVelha[0][0].equals(jogoDaVelha[1][1]) && jogoDaVelha[0][0].equals(jogoDaVelha[2][2])) {
            if (!jogoDaVelha[1][1].equals("-")) {
                fimJogo = true;
                if (jogoDaVelha[0][0].equals("X")) {
                    System.out.println("Fim do Jogo! o jogador 1 venceu!(diagonal principal)");
                }
                if (jogoDaVelha[0][0].equals("O")) {
                    System.out.println("Fim do Jogo! o jogador 2 venceu!(diagonal principal)");
                }
            }
        }
        if (jogoDaVelha[0][2].equals(jogoDaVelha[1][1]) && jogoDaVelha[2][0].equals(jogoDaVelha[1][1])) {
            if (!jogoDaVelha[1][1].equals("-")) {
                fimJogo = true;
                if (jogoDaVelha[0][0].equals("X")) {
                    System.out.println("Fim do Jogo! o jogador 1 venceu!(diagonal secundaria)");
                }
                if (jogoDaVelha[0][0].equals("O")) {
                    System.out.println("Fim do Jogo! o jogador 2 venceu!(diagonal secundaria)");
                }
            }
        }

    }
}
