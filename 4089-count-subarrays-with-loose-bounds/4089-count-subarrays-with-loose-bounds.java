class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        long subArr = 0;
        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            if(n >= minK && n <= maxK) {
                subArr++;
                ans += subArr;
            } else {
                subArr = 0;
            }
        }
        return ans;
    }
}
