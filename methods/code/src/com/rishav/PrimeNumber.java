package com.rishav;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(84));
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
