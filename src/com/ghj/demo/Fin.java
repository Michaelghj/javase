package com.ghj.demo;

public class Fin {
    public static int fin(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fin(n - 1) + fin(n - 2);
    }

    public static void main(String[] args) {
        fin(11);
    }
}
