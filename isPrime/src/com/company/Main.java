package com.company;

public class Main {
    public static boolean isPrime( int a){
        if (a<2){
            return false;
        }
        for (int i = 2; i*i < a; i++) {
            if (a % i ==0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
	System.out.println(isPrime(15));
    }
}
