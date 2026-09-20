// Day-1 (Q-3) https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0,
            j = nums.length - 1;

        int k = nums.length - 1;

        int[] res = new int[nums.length];

        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
               res[k] = nums[i] * nums[i];
                i++;
            }
            else{
                res[k] = nums[j] * nums[j];
                j--;
            }

            k--;
        }

        return res;
        

    }
}
