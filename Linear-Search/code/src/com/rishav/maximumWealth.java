package com.rishav;

import java.util.Arrays;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,9}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum =  sum + accounts[person][account];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }

}
