package com.bernard.cursojava.aula35;

public class Calculadora {
    public static long fatorialNaoRecursivo(int n){
        int n0 = 1;
        for (int i = 1; i <= n; i++) {
            n0 = n0 * i;
        }
        return n0;
    }
    
    public static long fatorial(int n){
        
        if (n == 0) {
            return 1;
        }
        
        return n * fatorial(n - 1);
    }
}
