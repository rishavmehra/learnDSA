package com.rishavRepeat;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of premitives
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
////        for (int num : arr) { // Here num represent the element the array -  for every element in the array print the element
////            System.out.print(num + " ");
////        }// one to print the array
//
//        System.out.println(Arrays.toString(arr)); // second way to print the array

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
