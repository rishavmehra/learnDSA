package com.rishav;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 33,  55, 54},
                {45, 2}
        };
        int target = 33;
        int[] ans = search(arr, target);
        int ansMin = searchMin(arr);
        System.out.println(ansMin);
    }

    static int[] search(int[][] arr, int target) {
        for (int row  = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] ==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }
    static int searchMin(int[][] arr) {
        int max = 0;
        for (int row  = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;

    }


}
