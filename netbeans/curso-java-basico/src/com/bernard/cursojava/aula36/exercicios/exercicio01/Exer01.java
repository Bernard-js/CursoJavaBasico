package com.bernard.cursojava.aula36.exercicios.exercicio01;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        
        System.out.println("Escreva o nome da agenda");
        agenda.setNome(scanner.next());
                
        Contato[] contatos = new Contato[3];
        
        for (int i = 0; i < contatos.length; i++) {
            
            contatos[i] = new Contato();
            
            System.out.println("Escreva o nome do contato " + (i + 1));
            contatos[i].setNome(scanner.next());
            
            System.out.println("Escreva o telefone do contato " + (i + 1));
            contatos[i].setTelefone(scanner.next());
            
            System.out.println("Escreva o email do contato " + (i + 1));
            contatos[i].setEmail(scanner.next());
        }
        
        agenda.setContatos(contatos);
        
        if (agenda != null) {
            agenda.obterInfo();
        }
        
    }
}
