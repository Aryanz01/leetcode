public class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative or if it ends with 0 and is not 0, it's not a palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            // Build the reversed half of the number
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number is a palindrome, either the reversed half will be equal to x,
        // or in case of odd number of digits, the reversed half divided by 10 should be equal to x.
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
