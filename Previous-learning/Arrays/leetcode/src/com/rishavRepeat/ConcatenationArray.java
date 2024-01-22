package com.rishavRepeat;
// 23JAN https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length*2; i++) {
            ans[i]  = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
