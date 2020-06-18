package com.bernard.cursojava.aula19.exercicios;

import java.text.DecimalFormat;

public class Exercicio09 {
    public static void main(String[] args) {
        
        double[] vA = new double[10];
        double[] vB = new double[vA.length];
        double[] vC = new double[vA.length]; 
        String formatVc;
   
        for (int i = 0; i < vA.length; i++) {
            vA[i] = i * 2 + 1;
            System.out.println(vA[i]);
        }
        
        for (int i = 0; i < vB.length; i++){
            vB[i] = vA[i] * vA[i];
            System.out.println(vB[i]);
        }
        
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
       
        for (int i = 0; i < vC.length; i++) {
            vC[i] = vA[i] / vB[i];
            formatVc = decimalFormat.format(vC[i]);
            System.out.println(formatVc);
        }
    }
}
