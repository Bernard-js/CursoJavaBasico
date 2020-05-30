package com.bernard.cursojava.aula17;

public class LoopFor {

    public static void main(String[] args) {

        // For Normal
        for (int i = 1; i < 5; i++){
            System.out.println("valor do i: " + i);
        }

        // For com Decremento
        for (int i = 5; i > 0; i--){
            System.out.println("Valor do i: " + i);
        }

        // For com duas variáveis
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + " j = " + j);
        }

        //Partes Ausentes
        int count  = 0;
        for (; count < 10 ;){
            System.out.println("Counter: " + count);
            count += 2;
        }

        for (short contador = 0; contador < 18; contador += 3){
            System.out.println("Valor do Contador: " + contador);
        }

        //A soma dos n primeiros números naturais
        long soma = 0;
        for (byte n = 1; n <= 5; soma += n++);
        System.out.println("A soma dos 5 primeiros números naturais: " + soma);


    }
}
