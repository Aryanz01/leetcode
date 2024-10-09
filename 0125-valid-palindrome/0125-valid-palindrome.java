class Solution {
    public boolean isPalindrome(String s) {
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters on the left side
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters on the right side
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters after converting them to lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers toward the center
            left++;
            right--;
        }

        return true;  // It's a palindrome if no mismatches found
    }
}
