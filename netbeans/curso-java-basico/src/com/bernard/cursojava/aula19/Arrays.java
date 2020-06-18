package com.bernard.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        double temp001 = 30;
        double temp002 = 31.8;
        double temp003 = 33.2;
        double temp004 = 25;
        double temp005 = 23.5;
        double temp006 = 36;

        double[] temperaturas = new double[365];
        temperaturas[0] = 30.5;
        temperaturas[1] = 34.5;
        temperaturas[2] = 10;
        temperaturas[3] = 12.5;
        temperaturas[4] = 34;
        temperaturas[5] = 40.3;

        System.out.println("O valor da temperatura do dia 3: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Endereço de memória do array: " + temperaturas);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + ": " + temperaturas[i]);
        }

        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
