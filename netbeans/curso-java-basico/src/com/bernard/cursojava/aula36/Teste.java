package com.bernard.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {
        
        //criar objeto endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Augusta");
        endereco.setNumero("n/a");
        endereco.setComplemento("-");
        endereco.setCidade("São Paulo");
        endereco.setEstado("São Paulo");
        endereco.setCep("53746-152");
        
        //Criar Array de telefones
        Telefone telefone = new Telefone();
        telefone.setDdd("81");
        telefone.setNumero("998276563");
        telefone.setTipo("Celular");
        
        Telefone telefone2 = new Telefone();
        telefone2.setDdd("81");
        telefone2.setNumero("95647833");
        telefone2.setTipo("Fixo");
        
        Telefone telefone3 = new Telefone();
        telefone3.setDdd("11");
        telefone3.setNumero("96457263");
        telefone3.setTipo("Celular");
        
        Telefone[] telefones = new Telefone[3];
        
        telefones[0] = telefone;
        telefones[1] = telefone2;
        telefones[2] = telefone3;
        
        //Criando Contato
        Contato contato = new Contato();
        contato.setNome("Bernard");
        contato.setEndereco(endereco);
        contato.setTelefones(telefones);
        
        System.out.println(contato.getNome());
        
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNomeRua());
        }
        
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getNumero());
                System.out.println(t.getTipo());
            }
        }
    }
}
