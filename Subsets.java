// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         int n=nums.length;
//         for(int mask=0 ; mask < (1<<n) ; mask++){
//              List<Integer> sub = new ArrayList<>();
//             for(int i=0 ; i<n ; i++){
//                 if( (mask & (1<<i)) !=0){
//                     sub.add(nums[i]);
//                 }
//             }
//             result.add(sub);
//         }
//         return result;
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Try including each remaining element
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);  // Choose
            generateSubsets(i + 1, nums, current, result);  // Explore
            current.remove(current.size() - 1);  // Un-choose (backtrack)
        }
    }
}
