package com.bernard.cursojava.aula43;

public class Professor extends Pessoa {
    private String depatarmento;
    private String nomeCurso;
    private double salario;

    public String getDepatarmento() {
        return depatarmento;
    }

    public void setDepatarmento(String depatarmento) {
        this.depatarmento = depatarmento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do professor: ";
        s += super.getEndereco();

        return s;
    }

}
