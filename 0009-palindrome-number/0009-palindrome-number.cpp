class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        int n=s.size();
        int j=n-1;
        int flag=0;
        for(int i =0; i<n; i++){
            
            if(s[i]==s[j]){
               flag=1; 
            }
            
            else{
                flag=0;
                break;
            }
            
            j=j-1;
            
        }
        
        if(flag==0){
            return false;
        }
        
        else{
            return true;
        }
        
    }
};