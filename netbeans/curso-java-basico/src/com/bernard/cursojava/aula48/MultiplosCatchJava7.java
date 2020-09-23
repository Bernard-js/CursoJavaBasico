package com.bernard.cursojava.aula48;

public class MultiplosCatch {
    public static void main(String[] args) {

        int[] numeros = {2, 4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 5, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por 0");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("não existe esta posição no array");
            }

        }

    }
}
