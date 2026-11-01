class Solution {
    public int minMergedInteger(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i+=2) {
            int mergeNum = Integer.parseInt(String.valueOf(nums[i]) + String.valueOf(nums[i+1]));
            ans = Math.min(ans, mergeNum);
        }
        return ans;
    }
}
