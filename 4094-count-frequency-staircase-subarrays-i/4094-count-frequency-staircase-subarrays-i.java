class Solution {
    public int countStaircase(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            HashMap<Integer, Integer> mp = new HashMap<>();
            ArrayList<Integer> order = new ArrayList<>();

            for(int j=i; j<nums.length; j++) {
                if(!mp.containsKey(nums[j])) {
                    mp.put(nums[j], 1);
                    order.add(nums[j]);
                } else {
                    mp.put(nums[j], mp.get(nums[j]) + 1);
                }
                boolean valid = true;
                for(int k=0; k<order.size(); k++) {
                    if(mp.get(order.get(k)) != k+1){
                        valid = false;
                        break;
                    }
                }
                if(valid) ans ++;
            }
        }
        return ans;
    }
}
