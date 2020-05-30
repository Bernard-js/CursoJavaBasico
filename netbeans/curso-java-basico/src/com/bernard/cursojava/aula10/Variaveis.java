/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bernard.cursojava.aula10;

/**
 *
 * @author Paula Inojosa
 */
public class Variaveis {
    public static void main(String[] args) {
        
        //convenção Java
        int idade = 20;
        String nome = "Bernard";
        String nomeDoMeuCachorro = "Nick";
        String ano2014 = "2014";
        //aceito, mas não utilizado
        int _idade;
        int $idade;
       
        
        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String NomeDoMeucachorro;
        
        idade = 25;
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        //má prática
        int a = 10;
        String b = "Sistema";
        
    }
}
