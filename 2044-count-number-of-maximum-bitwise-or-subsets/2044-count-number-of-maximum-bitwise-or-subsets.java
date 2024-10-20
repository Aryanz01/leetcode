class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        // Step 1: Calculate the maximum bitwise OR possible
        for (int num : nums) {
            maxOr |= num;
        }
        
        // Step 2: Use a backtracking approach to count subsets with maxOr
        return countSubsets(nums, 0, 0, maxOr);
    }
    
    private int countSubsets(int[] nums, int index, int currentOr, int maxOr) {
        if (index == nums.length) {
            // Check if the current subset has the maximum OR value
            return currentOr == maxOr ? 1 : 0;
        }
        
        // Include the current element
        int include = countSubsets(nums, index + 1, currentOr | nums[index], maxOr);
        // Exclude the current element
        int exclude = countSubsets(nums, index + 1, currentOr, maxOr);
        
        // Return the total count
        return include + exclude;
    }
}
