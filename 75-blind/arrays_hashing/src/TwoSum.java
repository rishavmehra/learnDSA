public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/

    // time complexity: o(n)^2
    // Space complexity: O(1)


    // Brute force
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0; i < nums.length; i++){
                for(int j=i+1; j< nums.length; j++){
                    if(nums[j]==target-nums[i]){
                        return new int[] {i, j};
                    }
                }
            }
            return  null;
        }
    }

    ////////////////


    // Using hash table
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> maps = new HashMap<>();

            for(int i =0; i < nums.length; i++){
                int num =  nums[i];
                int diff = target - num;
                if(maps.containsKey(diff)){
                    return new int[] { maps.get(diff), i};
                }
                maps.put(num, i);
            }
            return new int[] {};
        }
    }
}
