// class Solution {
// public:

       //O(n^2)

//     int maxSubArray(vector<int>& nums) {
//         int n= nums.size();
//         int maxsum=nums[0];
//         int currentsum;

//         for(int i=0; i<n; i++){
//             currentsum=0;
//             for(int j=i ; j<n ;j++){
//                 currentsum= currentsum + nums[j];
//                 maxsum= std::max(currentsum , maxsum);
//             }
//         }

//         return maxsum;
        
//     }
// };

/*

       // Divide and Conquer

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int s=0;
        int e=nums.size()-1;
       int ans= dividee(nums,s,e);

       return ans;
}
    int dividee(vector<int>& nums, int s, int e){
        if(s==e){
            return nums[s];
        }

        int m=(s+e)/2;
        return max( max(dividee(nums, s, m) , dividee(nums,m+1,e)) , maxx(nums,s,m,e));
    }

    int maxx(vector<int>& nums, int s,int m, int e){
        //leftmax, rightmax, leftmax+rightmax

        //left side
        int sum=0 , leftmax= INT_MIN;
        for(int i=m;i>=s;i--){
            sum=sum+ nums[i];
            if(leftmax < sum){
                leftmax=sum;
            }

        }
    
        int rightmax = INT_MIN;
        sum=0;
        for(int i=m+1;i<=e;i++){
            sum=sum+nums[i];
            if(rightmax<sum){
                rightmax=sum;
            }
        }
        return max(max(leftmax, rightmax), rightmax+leftmax);
    }
    
};

*/

//dynamic programing


class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        int ans=solve(nums, n);
        return ans;
    }  

    int solve(vector<int>& nums, int n){
        vector<int> dp(n, 0);
        dp[0]=nums[0];
        int ans=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=max(nums[i], nums[i] + dp[i-1]);
            ans=max(ans,dp[i]);
        }

        return ans;

    }  
};



