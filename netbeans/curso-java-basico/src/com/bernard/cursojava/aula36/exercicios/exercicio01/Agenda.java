package com.bernard.cursojava.aula36.exercicios.exercicio01;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public void obterInfo() {
        System.out.println("Nome da Agenda: " + this.getNome());

        int i = 0;
        for (Contato contato : contatos) {
            if (this.contatos[i] != null) {
                i++;
                System.out.println("Informações sobre o contato " + i);
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("E-mail: " + contato.getEmail());
                System.out.println();
            }
        }
    }
}
