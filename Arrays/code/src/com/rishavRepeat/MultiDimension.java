package com.rishavRepeat;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        int[][] arr = new int[3][2];

        //Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //Output Way 1
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        //OUTPUT way 2
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output way 3 using for each
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
