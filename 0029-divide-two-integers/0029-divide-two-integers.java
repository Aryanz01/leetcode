class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge case of overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        // Convert both numbers to negative to handle the edge case of Integer.MIN_VALUE
        int a = -Math.abs(dividend);
        int b = -Math.abs(divisor);
        int result = 0;

        // Perform the division using bit manipulation
        while (a <= b) {
            int temp = b, count = 1;
            while (a - temp <= temp) {
                temp <<= 1;
                count <<= 1;
            }
            a -= temp;
            result += count;
        }

        return sign * result;
    }
}
