package com.bernard.cursojava.aula43.exercicios.exer02;

public class PessoaJuridica extends Contribuinte {
    private final String CNPJ;
    private double rendaBruta;
    private final int ALIQUOTA = 10;

    public PessoaJuridica(String nome, String CNPJ, double rendaBruta) {
        super(nome);
        this.CNPJ = CNPJ;
        this.rendaBruta = rendaBruta;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public double calcularImposto() {
        return (rendaBruta * ALIQUOTA / 100);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", alíquota=" + ALIQUOTA +
                ", Imposto= R$" + calcularImposto() + ",00" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
