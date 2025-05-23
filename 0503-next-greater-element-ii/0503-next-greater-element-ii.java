class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        
        for(int i =2*n-1; i >=0 ; i--){
            
            while(!st.isEmpty() && st.peek() <= nums[i%n]){
                st.pop();
            }
                  
                  if(i<n){
                      if(!st.isEmpty()){
                          nge[i]=st.peek();
                      }
                      else{
                      nge[i]=-1;
                      }
                      
                  }
                  
                 
                  st.push(nums[i%n]);
            
        }
                  
                  return nge;
        
    }
}