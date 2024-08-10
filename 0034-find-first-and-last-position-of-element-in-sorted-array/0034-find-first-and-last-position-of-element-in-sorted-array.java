

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int[] arr = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        arr[0] = first;
        arr[1] = last;
        
        return arr;
    }
}

/*

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; 
        result[0] = findPosition(nums, target, true);
        
        
        if (result[0] == -1) {
            return result;
        }
        
        
        result[1] = findPosition(nums, target, false);
        
        return result;
    }
    
    // Helper method to find the first or last position of the target
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                position = mid;
                if (findFirst) {
                    right = mid - 1; // Look on the left side for the first position
                } else {
                    left = mid + 1; // Look on the right side for the last position
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return position;
    }
}

*/
