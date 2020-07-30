package com.bernard.cursojava.aula21;

import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        Random random = new Random();

        int[] notes = new int[10];

        for (int i = 0; i < notes.length; i++) {
            notes[i] = random.nextInt(20);
        }

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
            System.out.println(note);
        }

        System.out.println();
        System.out.println("Usando o forEach");
        System.out.println();

        for (int note : notes) {
            System.out.println(note);
        }

        //Usando o ForEach com Matrizes

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 9.5;
        notasAlunos[0][1] = 9.0;
        notasAlunos[0][2] = 5.7;
        notasAlunos[0][3] = 3.3;

        notasAlunos[1][0] = 5.5;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 7.5;

        notasAlunos[2][0] = 4.5;
        notasAlunos[2][1] = 6.7;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 8;

        for (double[] notasAluno : notasAlunos) {
            for (double nota : notasAluno) {
                System.out.println(nota + " ");
            }
            System.out.println();
        }

    }
}

