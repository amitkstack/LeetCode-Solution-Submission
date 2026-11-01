class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i < min) min = i;
        }
        long moves = 0;
        for(int x : nums) moves += x - min;
        return (int)moves;
    }
}
