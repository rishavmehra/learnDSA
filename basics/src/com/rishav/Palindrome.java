package com.rishav;

public class Palindrome {
    public static void main(String[] args) {
        if(reverse(121)){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }

    }
    public static boolean reverse(int x) {
        int original = x;
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit;
            if ((newResult - lastDigit) / 10 != result) {
                return false;
            }
            result = newResult;
            x /= 10;
        }
        return original == result;
    }

}
