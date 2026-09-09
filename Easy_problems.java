//217.Contains Duplicate
//Brute fore
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
//contain TC O(n^2) SC O(1) ,execution time may exceeds,so use heapset
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
//TC O(n) SC O(n)
//1.Two sums
//brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
if(sum==target){
return new int[]{i,j};
            }
            }
    }return new int[]{};
}
}

