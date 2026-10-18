class Solution {
    public int minDeletions(int[] nums) {
        int minCal = 0;
        for(int i=1; i<nums.length; i++) {
            if((nums[i-1]^nums[i]) == 0) minCal++;
        }
        return minCal;
    }
}
