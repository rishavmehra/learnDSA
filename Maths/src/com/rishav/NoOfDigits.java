package com.rishav;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 43453;
        int b=10;
        int ans = (int)(Math.log(n) / Math.log(b) ) +1;
        System.out.println(ans);
    }
}
