// class Solution {
// public:
//     int fib(int n) {
//         vector<int> dp(n+1,-1);
//         return ans(n,dp);
//     }
    
//     int ans(int n, vector<int> dp){
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
        
//         if(dp[n] !=-1){
//             return dp[n];
//         }
        
//         dp[n]=ans(n-1 , dp) +ans(n-2 , dp);
//         return dp[n];
//     }
// };

class Solution {
public:
    int fib(int n) {
        int dp[n+1];
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
        
        
    }
};