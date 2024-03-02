// class Solution {
// public:
//     int climbStairs(int n) {
        
//     vector<int> dp(n+1,-1);
//         if(n<=2){
//             return n;
//         }
        
//         if(dp[n] != -1){
//             return dp[n];
//         }
        
//         dp[n]=climbStairs(n-1) + climbStairs(n-2);
//         return dp[n];
//     }
// };


class Solution {
public:
    int climbStairs(int n) {
        
        int dp[n+1];
        
        if(n ==1){
            return 1;
        }
        
        if(n==2){
            return 2;
        }
        dp[1]=1;
        dp[2]=2;
    
        
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1] + dp[i-2];
        }
        
        return dp[n];
        
    }
};