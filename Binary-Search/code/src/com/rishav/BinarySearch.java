package com.rishav;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,9,11,18,21,22,45,56};
        int target = 55;
        System.out.println(binarySearch(arr,target));
    }


    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (target>arr[mid]){
                    start = mid +1;
            } else if (target<arr[mid]){
                end = mid-1;
            } else {
                return mid;
            }
        }
        return end;
    }

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}