package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o tipo de carne (alcatra, file duplo ou picanha): ");
        String tipo = scanner.next();

        System.out.println("Escreva a quantidade em Kg de carne que você deseja: ");
        double qtd = scanner.nextDouble();

        System.out.println("Você deseja usar o cartão tabajara(true ou false)?");
        boolean isTabajara = scanner.nextBoolean();

        if (tipo.equalsIgnoreCase("alcatra")){
            double valorKg = 0;

            if (qtd >= 0 && qtd <= 5){
                valorKg = 5.90;
            } else if (qtd > 5){
                valorKg = 6.80;
            } else {
                System.out.println("Não existe quantidade negativa");
            }

            double valorTotal = qtd * valorKg;

            double desconto = 0;

            String pagamento;
            if (isTabajara){
                desconto = 5 * valorTotal / 100;
                pagamento = "Cartão Tabajara";
            }
            else pagamento = "Convencional";

            double valorPago = valorTotal - desconto;

            System.out.println("Tipo da Carne: " + tipo);
            System.out.println("Quantidade de carne: " + qtd);
            System.out.println("Preço total: " + valorTotal);
            System.out.println("Tipo de pagamento: " + pagamento);
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor pago: " + valorPago);


        } else if (tipo.equalsIgnoreCase("file duplo")){

            double valorKg = 0;

            if (qtd >= 0 && qtd <= 5){
                valorKg = 4.90;
            } else if (qtd > 5){
                valorKg = 5.80;
            } else {
                System.out.println("Não existe quantidade negativa");
            }

            double valorTotal = qtd * valorKg;

            double desconto = 0;

            String pagamento;
            if (isTabajara){
                desconto = 5 * valorTotal / 100;
                pagamento = "Cartão Tabajara";
            }
            else pagamento = "Convencional";

            double valorPago = valorTotal - desconto;

            System.out.println("Tipo da Carne: " + tipo);
            System.out.println("Quantidade de carne: " + qtd);
            System.out.println("Preço total: " + valorTotal);
            System.out.println("Tipo de pagamento: " + pagamento);
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor pago: " + valorPago);

        } else if (tipo.equalsIgnoreCase("picanha")){

            double valorKg = 0;

            if (qtd >= 0 && qtd <= 5){
                valorKg = 6.90;
            } else if (qtd > 5){
                valorKg = 7.80;
            } else {
                System.out.println("Não existe quantidade negativa");
            }

            double valorTotal = qtd * valorKg;

            double desconto = 0;

            String pagamento;
            if (isTabajara){
                desconto = 5 * valorTotal / 100;
                pagamento = "Cartão Tabajara";
            }
            else pagamento = "Convencional";

            double valorPago = valorTotal - desconto;

            System.out.println("Tipo da Carne: " + tipo);
            System.out.println("Quantidade de carne: " + qtd);
            System.out.println("Preço total: " + valorTotal);
            System.out.println("Tipo de pagamento: " + pagamento);
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor pago: " + valorPago);

        } else {
            System.out.println("Escreva um dos tres tipos!");
        }
    }
}
