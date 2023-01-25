package com.rishavRepeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies =3;
//        System.out.println(Arrays.toString(kidsWithCandies(candies,extraCandies)));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = 0;

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max)
                max = candies[i];
        }
        for(int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

}
