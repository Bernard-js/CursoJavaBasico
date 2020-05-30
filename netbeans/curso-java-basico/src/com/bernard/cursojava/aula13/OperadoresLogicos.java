package com.bernard.cursojava.aula13;

public class OperadoresLogicos {
  
    public static void main(String[] args) {
        
        int valor1 = 5;
        int valor2 = 6;
        
        boolean resultado1 = (valor1 == 5) && (valor2 == 6);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);
        
        boolean resultado2 = (valor1 == 5) || (valor2 == 6);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado2);
        
        boolean verdadeiro = true;
        boolean falso = false;
        
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro || falso);
        
    }
}


