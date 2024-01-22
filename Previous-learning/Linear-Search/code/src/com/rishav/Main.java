package com.rishav;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45 , 6, 34, 22, 49, -1, 5, 6};
        int target = 34;
        int result = linearSearch(nums, target);
        System.out.println(result);
    }

    //search in the array: return the index of the item if found
    // if not please return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;// returning the index
//                return arr[i]; // returning the element
            }
        }
        return -1;
    }

}