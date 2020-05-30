package com.bernard.cursojava.aula13;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        int resultado = 5 + 3;
        System.out.println(resultado);
        
        resultado = resultado - 4;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado * 8;
        System.out.println(resultado);
        
        resultado = resultado % 3;
        System.out.println(resultado);
        
        String primeiroNome = "Esta é";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        System.out.println(resultado++);
        //Analogamente: 
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;
        
        System.out.println(++resultado);
        //Analogamente: 
        //resultado = resultado + 1 ;
        //resultado += 1;
        //System.out.println(resultado);
        
        //com o decremento, o comportamento é análogo
        System.out.println(resultado--);
        System.out.println(--resultado);
        
    }
}

