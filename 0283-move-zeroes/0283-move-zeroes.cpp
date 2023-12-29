class Solution {
public:
    void moveZeroes(std::vector<int>& nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != 0) {
            swap(nums[i], nums[nonZeroIndex]);
                nonZeroIndex++;
            }
        }
    }
};
