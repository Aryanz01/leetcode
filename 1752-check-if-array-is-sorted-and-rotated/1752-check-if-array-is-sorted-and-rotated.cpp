
//     class Solution {
// public:
//     bool check(vector<int>& nums) {
//         int temp = 0; // Initialize temp to 0
        
//         for (int i = 1; i < nums.size(); i++) {
//             if (nums[i - 1] >= nums[i]) {
//                 temp++;
//             }
//         }
        
//         if (temp > 1) {
//             return false;
//         }
        
//         if (temp == 1) {
//             if (nums[nums.size() - 1] > nums[0]) {
//                 return false;
//             }
//             return true;
//         }
        
//         // Handle the case when temp is 0
//         return true; // or false based on your requirements
//     }
// };


// class Solution {
// public:
//     bool check(vector<int>& nums) {
//         int temp=0;
        
//         for(int i=1; i<nums.size(); i++){
//             if(nums[i-1]>=nums[i]){
//                 temp++;
                
//             }
            
//         }
//         if(temp>1){
//             return false;
//         }
//            if(temp==1){
//             if(nums[nums.size()-1]>nums[0]){
//                 return false;
//             }
//                 return true;
//            }
// return true;
// }
    
// };


class Solution {
public:
    bool check(vector<int>& nums) {
        int temp = 0;
        
        // Count the number of "decreasing" points
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i - 1] > nums[i]) {
                temp++;
            }
        }
        
        // Check for a possible rotation
        if (temp > 1) {
            return false;
        }
        
        // If there's one "decreasing" point, ensure end-to-start continuity
        if (temp == 1 && nums[nums.size() - 1] > nums[0]) {
            return false;
        }
        
        return true;
    }
};
