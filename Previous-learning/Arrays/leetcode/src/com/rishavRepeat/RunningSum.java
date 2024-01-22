package com.rishavRepeat;
// 23JAN https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result[]= runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
