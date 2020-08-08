package com.bernard.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();
        
        int[] A = new int[4];
        A[0] = 32;
        A[1] = 54;
        A[2] = 132;
        A[3] = 645;
        
        System.out.println(calculadora.soma(1, 2));
        System.out.println(calculadora.soma(1.5, 3.75));
        System.out.println(calculadora.soma(1, 2, 3));
        System.out.println(calculadora.soma(A));
    }
}
