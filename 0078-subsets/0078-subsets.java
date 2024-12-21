class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        int n=nums.length;
        
        for(int mask=0 ; mask < (1<<n) ; mask++){
             List<Integer> sub = new ArrayList<>();
            
            for(int i=0 ; i<n ; i++){
                if( (mask & (1<<i)) !=0){
                    sub.add(nums[i]);
                }
                
            }
            result.add(sub);
        }
        
        return result;
        
    }
}