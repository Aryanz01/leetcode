/*

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int cnt=0;
        int i=0;
        int first;
        int last;
        int arr[]=0;
        int z=nums.length;
        
        
        
        while(z!=0){
            if(i==target){
            cnt++;
            if(cnt==1){
                first=i;
            }
            }
            else{
                arr[0]=first;
                arr[1]=last;
        }
            
            i++;
        }
        
        last=i;
        
        arr[0]=first;
        arr[1]=last;
        
        return arr;
        
        
        
    }
}

*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Initialize the result array with [-1, -1]
        
        // Find the first position of the target
        result[0] = findPosition(nums, target, true);
        
        // If the first position is not found, return [-1, -1]
        if (result[0] == -1) {
            return result;
        }
        
        // Find the last position of the target
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
