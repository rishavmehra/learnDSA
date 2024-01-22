package com.rishav;


public class FindMinNumber {
    public static void main(String[] args) {
    int[] arr = {23, 45 , 6, 34, 22, 49, -1, 5, 3};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
