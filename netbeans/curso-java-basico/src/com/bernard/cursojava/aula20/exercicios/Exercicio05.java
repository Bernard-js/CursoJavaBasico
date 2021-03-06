package com.bernard.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][][] meusCompromissos = new String[12][31][24];

        // Loop para manter o programa rodando
        boolean sairPrograma = false;
        boolean consultarAgenda;
        boolean adicionarCompromisso;
        String sairProgramaString;
        String consultarAgendaString;
        String adicionarCompromissoString;

        // Consulta a agenda
        int mesConsulta;
        int diaConsulta;
        int horaConsulta;

        // Novo Compromisso
        int mesCompromisso;
        int diaCompromisso;
        int horaCompromisso;
        String novoCompromisso;


        while (!sairPrograma) {

            System.out.println("Você deseja Sair do programa?(S/N)");
            sairProgramaString = scanner.next();

            if (sairProgramaString.equalsIgnoreCase("N")) {
                consultarAgenda = true;
                adicionarCompromisso = true;

                while(consultarAgenda){

                    System.out.println("Você deseja Consultar a sua agenda?(S/N)");
                    consultarAgendaString = scanner.next();

                    if (consultarAgendaString.equalsIgnoreCase("S")) {
                        System.out.println("Qual mês você gostaria de consultar(1 - 12)");
                        mesConsulta = scanner.nextInt();

                        System.out.println("Qual dia do mês você gostaria de consultar?(1 - 31)");
                        diaConsulta = scanner.nextInt();

                        System.out.println("Qual hora você gostaria de consultar?(0 - 23)");
                        horaConsulta = scanner.nextInt();

                        if (horaConsulta < 0 || horaConsulta > 23){
                            System.out.println("Hora inválida. Tente novamente");
                        } else if (diaConsulta < 1 || diaConsulta > 31){
                            System.out.println("Dia inválido. tente novamente");
                        } else if (mesConsulta < 1 || mesConsulta > 12){
                            System.out.println("Mês invalido. Tente novamente");
                        } else {
                            System.out.println("Compromisso: " + meusCompromissos[mesConsulta - 1][diaConsulta - 1][horaConsulta]);
                            System.out.println();
                        }

                    } else {
                        consultarAgenda = false;
                    }
                }

                while (adicionarCompromisso) {


                    System.out.println("Você deseja Adicionar um compromisso à sua agenda?(S/N)");
                    adicionarCompromissoString = scanner.next();

                    if (adicionarCompromissoString.equalsIgnoreCase("S")) {
                        System.out.println("Qual mês você gostaria de adicionar?");
                        mesCompromisso = scanner.nextInt();

                        System.out.println("Qual dia do mês você gostaria de adicionar?(1 - 31)");
                        diaCompromisso = scanner.nextInt();

                        System.out.println("Qual hora você gostaria de consultar?(0 - 23)");
                        horaCompromisso = scanner.nextInt();

                        System.out.println("Escreva o novo compromisso");
                        novoCompromisso = scanner.next();

                        if (horaCompromisso < 0 || horaCompromisso > 23){
                            System.out.println("Hora inválida. Tente novamente");
                        } else if (diaCompromisso < 1 || diaCompromisso > 31){
                            System.out.println("Dia inválido. tente novamente");
                        } else if (mesCompromisso < 1 || mesCompromisso > 12){
                            System.out.println("Mês inválido. Tente novamente");
                        } else {
                            meusCompromissos[mesCompromisso - 1][diaCompromisso - 1][horaCompromisso] = novoCompromisso;
                        }

                    } else {
                        adicionarCompromisso = false;
                    }
                }
            } else {
                sairPrograma = true;
            }
        }

    }
}
