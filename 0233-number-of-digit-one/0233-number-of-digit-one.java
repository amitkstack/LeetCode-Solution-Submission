class Solution {
    public int countDigitOne(int n) {
        int count = 0;

        for (long factor = 1; factor <= n; factor *= 10) {
            long higher = n / (factor * 10);
            long current = (n / factor) % 10;
            long lower = n % factor;

            count += higher * factor;

            if (current == 1) {
                count += lower + 1;
            } else if (current > 1) {
                count += factor;
            }
        }

        return count;
    }
}
