package com.bernard.cursojava.aula43.exercicios.exer02;

public class PessoaFisica extends Contribuinte {

    private final String CPF;
    private double rendaBruta;
    private int aliquota;
    private int parcela;

    public PessoaFisica(String nome, String cpf, double rendaBruta){
        super(nome);
        this.CPF = cpf;
        this.rendaBruta = rendaBruta;
    }

    public String getCPF() {
        return CPF;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public int getAliquota() {
        return aliquota;
    }

    public int getParcela() {
        return parcela;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();

        if (renda <= 1400){
            setAliquota(0);
            setParcela(0);
        }

        else if (renda > 1400 && renda <= 2100){
            setAliquota(10);
            setParcela(100);
        }

        else if (renda > 2100 && renda <= 2800){
             setAliquota(15);
             setParcela(270);
        }

        else if (renda > 2800 && renda <= 3600){
           setAliquota(25);
           setParcela(500);
        }

        else{
            setAliquota(30);
            setParcela(700);
        }

        return (getRendaBruta() * getAliquota() / 100) - getParcela();

    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", aliquota=" + aliquota +
                ", parcela=" + parcela +
                ", imposto= R$ " + this.calcularImposto() + ",00" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
