
package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean isName = true;
        boolean isAge = true;
        boolean isSalary = true;
        boolean isSex = true;
        boolean isCivicState = true;
        
        String name;
        int age;
        double salary;
        String sex;
        String civicState;
        
        while (isCivicState || isAge || isName || isSalary || isSex) {            
            
            System.out.println("Esreva o seu nome: ");
            name = scan.next();
            
            System.out.println("Esreva a sua idade : ");
            age = scan.nextInt();
            
            System.out.println("Esreva o seu salário: ");
            salary = scan.nextDouble();
            
            System.out.println("Esreva o seu sexo ('m' ou 'f'): ");
            sex = scan.next();
            
            System.out.println("Esreva o seu estado civil('s', 'c', 'v' ou 'd'): ");
            civicState = scan.next();
            
            if(name.length() > 3){
                isName = false;
            } else {
                System.out.println("O seu nome deve ter mais do que três letras!");
            }
            
            if (age > 0 && age < 150) {
                isAge = false;
            } else {
                System.out.println("Você deve ter entre 0 e 150 anos");
            }
            
            if (salary > 0) {
                isSalary = false;
            } else {
                System.out.println("O salário deve ser maior que 0");
            }
            
            if (sex.equalsIgnoreCase("m") || sex.equalsIgnoreCase("f")) {
                isSex = false;
            }
            
            if (civicState.equalsIgnoreCase("s")
            || civicState.equalsIgnoreCase("c") 
            || civicState.equalsIgnoreCase("v") 
            || civicState.equalsIgnoreCase("d") ) 
            {
                
                isCivicState = false;
            }
            else
            {
                System.out.println("O seu estado civil é inválido");
            }
        }

    }
}
