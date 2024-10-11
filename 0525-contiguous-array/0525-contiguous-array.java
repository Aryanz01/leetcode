import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // Map to store the first occurrence of each cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the map with a base case
        map.put(0, -1);  // This helps in handling cases where the whole array is valid
        
        int maxLength = 0;
        int cumulativeSum = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Replace 0 with -1 to treat it as a subarray sum problem
            if (nums[i] == 0) {
                cumulativeSum -= 1;
            } else {
                cumulativeSum += 1;
            }
            
            // If the cumulative sum has been seen before, a subarray with sum 0 is found
            if (map.containsKey(cumulativeSum)) {
                // Calculate the length of the subarray
                int previousIndex = map.get(cumulativeSum);
                int currentLength = i - previousIndex;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // Store the first occurrence of this cumulative sum
                map.put(cumulativeSum, i);
            }
        }
        
        return maxLength;
    }
}
