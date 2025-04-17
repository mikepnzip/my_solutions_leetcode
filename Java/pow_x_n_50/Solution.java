class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1;
        long absN = Math.abs((long)n);
        while (absN > 0) {
            if ((absN & 1) == 1) {
                result *= x;
            }
            x *= x;
            absN >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }
}
