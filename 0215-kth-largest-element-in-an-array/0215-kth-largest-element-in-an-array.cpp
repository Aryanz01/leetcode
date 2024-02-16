// class Solution {
// public:


// HEAPS APPROACH


//     int findKthLargest(vector<int>& nums, int k) {
//         priority_queue<int> pq;
//         int n=nums.size();
//         for(int i=0;i<n;i++){
//             pq.push(nums[i]);
//         }

//         for(int j=k-1;j>0;j--){
//             pq.pop();
//         }

//         return pq.top();

        
//     }
// };

class Solution{
public:
    int findKthLargest(vector<int>& nums, int k){
     sort(nums.begin(),nums.end(), greater());
        return nums[k-1];
    }
};