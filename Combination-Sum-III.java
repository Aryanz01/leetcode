class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        findcomb(1, k, n, ans, new ArrayList<>());
        return ans;

        
    }

    public void findcomb(int i, int k, int n, List<List<Integer>> ans, List<Integer> curr){
        if(n==0 && k==0){
            ans.add(curr);
            return;
        }

        if(i>9) return;

        if(n<0 || k<0) return;

        List<Integer> temp = new ArrayList<>(curr);
        temp.add(i);
        findcomb(i+1, k-1, n-i, ans,temp); //pick
        findcomb(i+1, k, n, ans,curr);  //dont pick
    }
}