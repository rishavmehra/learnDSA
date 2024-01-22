package com.rishavRepeat;

import java.util.Arrays;

/* 1672. Richest Customer Wealth
 https://leetcode.com/problems/richest-customer-wealth/ */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.print(maximumWealth(arr)+ " ");
        }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int row=0; row<accounts.length; row++){
            int sum =0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
