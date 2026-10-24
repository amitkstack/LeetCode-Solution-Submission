class Solution {
    public int peakValleyDifference(int[] nums) {
        int evenNum = 0;
        int oddNum = 0;
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                evenNum += nums[i];
            } 
            if(nums[i] < nums[i-1] && nums[i] < nums[i+1]){
                oddNum += nums[i];
            }
        }
        return evenNum - oddNum;
    }
}
