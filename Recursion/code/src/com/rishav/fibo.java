package com.rishav;

public class fibo {
    public static void main(String[] args) {
        int ans = fibo1(10);
        System.out.println(ans);
    }

    static int fibo1(int n){
        if(n<2){
            return n;
        }
        return fibo1(n-1) + fibo1(n-2);
    }
}