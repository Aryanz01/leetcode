class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n = nums.size();
        
        for (int i = 0; i < n; ++i) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; ++j) { 
                    nums[j] = nums[j + 1]; 
                }
                --n; 
                --i;  // when an element is removed from 0,tab array is shifted to left
                      // but the i index is moved to the 1 without again checking the
                      // 0 index element. so it is necessary to decrement i.
            }
        }
        
        return n;
    }
};
