class Solution {
    public boolean containsDuplicate(int[] nums) { 
        for(int i=0;i<=nums.length-1;i++){
            for(int key=i+1;key<nums.length;key++){
                if(nums[i]==nums[key]){
                    return true;
                }
            }
        }
        return false;
    }
}
