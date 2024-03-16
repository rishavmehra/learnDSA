class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashs = new HashSet<>();
        for(int i =0; i < nums.length ; i++){
            if(hashs.contains(nums[i])){
                return true;
            }
            else{
                hashs.add(nums[i]);
            }
        }
        return false;
    }
}