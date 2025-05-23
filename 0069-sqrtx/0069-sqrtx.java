class Solution {
    public int mySqrt(int x) {
       
        int high=x;
        int low=1;
        int ans=1;
        
        if(x==0 || x==1){
            return x;
            
        }
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid*mid==x){
                ans = mid;
                break;
                
            }
             if(mid <= x/mid){
                ans = mid;
                low= mid+1;
                
            }
            
            else{
                high = mid -1;
            }
        }
        
        return ans;
        
    }
}