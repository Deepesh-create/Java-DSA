// Day-2 (Q-7) https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        Collections.sort(nums);

        int i = 0,
            j = nums.size() - 1,
            count = 0;

        while(i<j){
            int sum = nums.get(i) + nums.get(j);

            if(sum < target){
                count = count + (j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
