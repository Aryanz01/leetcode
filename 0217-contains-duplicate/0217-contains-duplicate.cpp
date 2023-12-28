class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        std::sort(nums.begin() , nums.end());

        int n= nums.size();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }

        }
        return false;
    }

        /*
        
        int n= nums.size();
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(nums[i]==nums[j]){
                   return true;
               }
    
           }
       } 

       return false;

    }

    */

    

};