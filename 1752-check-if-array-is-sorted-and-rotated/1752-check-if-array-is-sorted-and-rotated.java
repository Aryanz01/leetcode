class Solution {
    public boolean check(int[] nums) {
        int temp = 0;
        
        // Count the number of "decreasing" points
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                temp++;
            }
        }
        
        // Check for a possible rotation
        if (temp > 1) {
            return false;
        }
        
        // If there's one "decreasing" point, ensure end-to-start continuity
        if (temp == 1 && nums[nums.length - 1] > nums[0]) {
            return false;
        }
        
        return true;
    }
}
