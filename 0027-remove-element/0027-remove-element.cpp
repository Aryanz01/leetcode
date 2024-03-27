class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n = nums.size();
        
        for (int i = 0; i < n; ++i) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; ++j) { // Loop until n - 1 to avoid accessing out of bounds
                    nums[j] = nums[j + 1]; // Move elements one position to the left
                }
                --n; // Decrease the size of nums after moving an element
                --i; // Decrement i to recheck the current position after moving an element
            }
        }
        
        return n;
    }
};
