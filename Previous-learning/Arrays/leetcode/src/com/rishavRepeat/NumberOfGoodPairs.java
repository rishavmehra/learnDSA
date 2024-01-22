package com.rishavRepeat;
//https://leetcode.com/problems/number-of-good-pairs/
// 1512. Number of Good Pairs
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));

    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0, j =nums.length-1 ; i < nums.length; i++) {
            if(j<i){
                j=nums.length-1;
            }
            while(i<j){
                if(nums[i]==nums[j]){
                    count+=1;
                }
                j--;
            }
        }
        return count;
    }

}
