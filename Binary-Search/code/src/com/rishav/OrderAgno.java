package com.rishav;

public class OrderAgno {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,9,11,18,21,34,45,56};
        int target = 34;
        System.out.println(orderAgno(arr,target));
    }

    static int orderAgno(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        boolean isAscending = arr[left] < arr[right];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (isAscending) {
                    if (arr[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (arr[mid] > target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

}
