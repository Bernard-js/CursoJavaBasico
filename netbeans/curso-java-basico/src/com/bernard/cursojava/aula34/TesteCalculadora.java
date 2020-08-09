package com.bernard.cursojava.aula34;

public class TesteCalculadora {
    
    private static int resultSoma;
    
    public static void main(String[] args) {
        
        resultSoma = MinhaCalculadora.soma(21, 32);
        System.out.println(resultSoma);
        
        int[] A = new int[4];
        A[0] = 32;
        A[1] = 54;
        A[2] = 132;
        A[3] = 645;
        
        System.out.println(MinhaCalculadora.soma(1, 2));
        System.out.println(MinhaCalculadora.soma(1.5, 3.75));
        System.out.println(MinhaCalculadora.soma(1, 2, 3));
        System.out.println(MinhaCalculadora.soma(A));
    }
}
