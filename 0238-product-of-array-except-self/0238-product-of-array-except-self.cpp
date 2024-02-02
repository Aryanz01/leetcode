class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        /*
        vector<int> ans;
        int x=1;
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<nums.size();j++){
                if(j!=i){
                    x=  x*nums[j];
                }
            }
             ans.push_back(x);
             x=1;
        }

        return ans;
    }
    */

/*
    //left

    vector<int> ans1;
    vector<int> ans2;
    vector<int> ans3;
    int x=1;

    for(int i=0; i<nums.size();i++){
        if(i!=0){
            x=x*nums[i];
        }
    }
    ans1.push_back(x);

    for

    }

};
*/
/*
class Solution {
public:
    std::vector<int> productExceptSelf(std::vector<int>& nums) {
        int n = nums.size();
        std::vector<int> result(n, 1);
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= prefixProduct;
            prefixProduct *= nums[i];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
};
*/
int n=nums.size();

    vector<int> ans1(n,1);
    vector<int> ans2(n,1);
    vector<int> ans3(n,1);
    int x=1;

    //left
    for(int i=1;i<nums.size();i++){
        x=x*nums[i-1];
        ans1[i]=x;
    }
    
    //right

    int y=1;
    for(int j=nums.size()-2;j>=0;--j){
        y=y*nums[j+1];
        ans2[j]=y;
    }

    for(int r=0 ; r<nums.size(); ++r){
        ans3[r]=ans1[r]*ans2[r];
    }

    return ans3;

    }
};
   




