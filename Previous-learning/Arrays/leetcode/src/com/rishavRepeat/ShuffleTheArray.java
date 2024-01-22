package com.rishavRepeat;
// https://leetcode.com/problems/shuffle-the-array/description/
// 1470. Shuffle the Array
import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        for(int i=0, j=0; i<n; i++, j=j+2){
            result[j] = nums[i];
            result[j+1] = nums[i+n];
        }
        return result;
    }
}
