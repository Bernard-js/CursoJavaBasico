package com.bernard.cursojava.aula46.exercicios.figuras.figuras2D;

import com.bernard.cursojava.aula46.exercicios.figuras.DimensaoSuperficial;
import com.bernard.cursojava.aula46.exercicios.figuras.Figura2D;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return (base * altura / 2);
    }
    
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
