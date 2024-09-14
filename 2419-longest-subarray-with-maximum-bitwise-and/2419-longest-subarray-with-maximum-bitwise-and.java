import java.lang.Math;

class Solution {
    public int longestSubarray(int[] nums) {
        int max_and = 0;
        int n = nums.length;
        int longest_len = 0;
        
        // Step 1: Find the maximum element in the array (max AND value)
        for (int num : nums) {
            max_and = Math.max(max_and, num);
        }
        
        // Step 2: Traverse the array to find subarrays with max AND value
        int curr_len = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == max_and) {
                curr_len++; // Continue if current element matches max AND
            } else {
                longest_len = Math.max(longest_len, curr_len); // Update longest length
                curr_len = 0; // Reset the length when a mismatch is found
            }
        }
        
        // After the loop, check the last subarray
        longest_len = Math.max(longest_len, curr_len);
        
        return longest_len;
    }
}
