package com.rishav;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45 , 6, 34, 22, 49, -1, 5, 6};
        int target = 34;
        int result = rangeSearch(nums, target, 1, 4);
        System.out.println(result);

    }
    static int rangeSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i]==target){
                return i;// returning the index
//                return arr[i]; // returning the element
            }
        }
        return -1;
    }
}
