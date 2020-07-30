package com.bernard.cursojava.aula24.exercicios;

public class Teste {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.marca = "Phillips";
        l1.tipo = "Fluorescente";
        l1.preco = 22.50;
        l1.potencia = 40;
        l1.acesa = false;
        
        Livro livro = new Livro();
        livro.nome = "Lord of the Rings";
        livro.autor = "JRR Tolkien";
        livro.editora = "Martins Fontes";
        livro.numPaginas = 450;
        
        LivroDeLivraria lv = new LivroDeLivraria();
        lv.nome = "A Máquina";
        lv.autor = "Alicia Klein";
        lv.editora = "BestSeller";
        lv.numPaginas = 268;
        lv.preco = 80.00;
        
        LivroDeBiblioteca  lb = new LivroDeBiblioteca();
        lb.nome = "Fundamentos de Matemática Elementar";
        lb.autor = "Gelson Iezzi";
        lb.editora = "Atual";
        lb.categoria = "Matemática";
        lb.numPaginas = 282;
        lb.emprestar = true;
        lb.dataEmprestimo = 10;
        
        ContaCorrente cc = new ContaCorrente();
        cc.numero = 2323424;
        cc.agencia = 645443;
        cc.especial = false;
        cc.limite = 10000.00;
        cc.saldo = 5000.00;
        
        Contato contato = new Contato();
        contato.nome = "Roberto";
        contato.ddd = 11;
        contato.numero = 996537335;
        contato.operadora = "TIM";
        
        System.out.println(l1.potencia);
        System.out.println(livro.nome);
        System.out.println(lv.preco);
        System.out.println(lb.categoria);
        System.out.println(cc.agencia);
        System.out.println(contato.operadora);
    }
}
