class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        java.util.Arrays.fill(result, -1);  // Fill the result array with -1
        java.util.Stack<Integer> stack = new java.util.Stack<>();  // Stack to keep track of indices

        for (int i = 0; i < 2 * n; i++) {  // Traverse the array twice
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                result[stack.pop()] = nums[i % n];  // Update result for the index at the top of the stack
            }
            if (i < n) {
                stack.push(i);  // Push the current index onto the stack
            }
        }
        
        return result;
    }
}
