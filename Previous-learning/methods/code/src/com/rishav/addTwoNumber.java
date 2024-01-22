package com.rishav;

import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sum();
        System.out.print("Please enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Please enter the 2st number: ");
        int num2 = in.nextInt();
        int result = sum2(num1,num2);
        System.out.println("Function two result: "+result);
    }

    static void sum (){
        Scanner in = new Scanner(System.in);

        System.out.println("<----Sum of two number----> ");
        System.out.print("Please enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Please enter the 2st number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Result is: " + sum);
    }

    static int sum2(int a, int b){
        return a+b;
    }

}