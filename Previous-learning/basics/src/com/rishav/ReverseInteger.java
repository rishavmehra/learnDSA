package com.rishav;

public class ReverseInteger {
    public static void main(String[] args) {
        int x =123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit;
            if ((newResult - lastDigit) / 10 != result) {
                return 0;
            }

            result = newResult;
            x /= 10;
        }
        return result;
    }
}
