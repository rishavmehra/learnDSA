package com.rishav;

public class xor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 4, 3, 6};
        System.out.println(ans(arr));
    }

    public  static  int ans(int[] arr){
        int res = 0;
        for(int n: arr){
            res ^= n;
        }
        return res;
    }
}
