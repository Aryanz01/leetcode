// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(candidates, target, 0, new ArrayList<>(), result);
//         return result; 
//     }
//     private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
       
//         if (target == 0) {
//             result.add(new ArrayList<>(current));
//             return;
//         }
//         if (target < 0) {
//             return;
//         }
//         for (int i = start; i < candidates.length; i++) {
//             current.add(candidates[i]); 
//             backtrack(candidates, target - candidates[i], i, current, result); 
//             current.remove(current.size() - 1); 
//         }
//     }
// }



import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int start =0;
         findcomb(start, candidates, target, ans,new ArrayList<>());
         return ans;
    }

    public void findcomb(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds){
        if(index == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index]<= target){
            ds.add(candidates[index]);
            findcomb(index, candidates, target- candidates[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        findcomb(index +1, candidates, target, ans, ds);


    }
}