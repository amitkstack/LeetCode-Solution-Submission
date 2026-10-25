class Solution {
    public int binDigit(int n) {
        int count = 0;
        while(n > 0) {
            int rem = n % 2;
            if(rem == 1) count++;
            n = n / 2;
        }
        return count;
    }
    public int calculateScore(int a, int b) {
        int s1 = binDigit(a);
        int s2 = binDigit(b);
        return s1 >= s2 ? s1*s2 : s2/s1;
    }
}
