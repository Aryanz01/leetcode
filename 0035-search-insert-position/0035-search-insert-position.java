class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int mid=0;
        while(s<=e){
            mid= s+(e-s)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[mid]>target){
                e=mid-1;
            }
            
            else{
                s=mid+1;
            }
        }
        return s;
        
    }
}