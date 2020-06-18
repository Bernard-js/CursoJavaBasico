
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean isEqual = true;
        String usuario;
        String senha;
        
        while (isEqual) {            
            System.out.println("Escreva o seu nome de usuario: ");
            usuario = scan.next();
            
            System.out.println("Escreva sua senha: ");
            senha = scan.next();
            
            if(!senha.equals(usuario)){
                isEqual = false;
            } else {
                System.out.println("A senha não pode ser igual ao nome de usuario!");
            }
        }
    }
}
