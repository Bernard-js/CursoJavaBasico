package com.bernard.cursojava.aula17.exercicios;

public class Exercicio16 {
    
    public static void main(String[] args) {
        
        int fib1 = 0;
        int fib2 = 1;
        int resultado = 1;
        int i = 1;
        
        while (resultado <= 500) {            
            System.out.println("Fibonacci " + i + " = " + resultado);
            resultado = fib1 + fib2;
            fib1 = fib2;
            fib2 = resultado;
            i++;
        }
       
    }
}

