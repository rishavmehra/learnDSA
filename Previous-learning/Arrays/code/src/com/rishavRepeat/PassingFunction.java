package com.rishavRepeat;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {

        int[] num = {3, 4, 5, 4, 6, 7};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.print(Arrays.toString(num));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }


}
