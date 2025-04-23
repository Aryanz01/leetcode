class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        findcomb(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void findcomb(int[] nums, List<List<Integer>> ans, List<Integer> ds, int index) {
        ans.add(new ArrayList<>(ds));  // Add current subset

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates (only at same recursion level)
            if (i > index && nums[i] == nums[i - 1]) continue;

            ds.add(nums[i]);                        // Choose
            findcomb(nums, ans, ds, i + 1);         // Explore
            ds.remove(ds.size() - 1);               // Un-choose (backtrack)
        }
    }
}
