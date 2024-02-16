/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // void inorder(TreeNode* root, vector<int > &arr){
    //     if(root==NULL){
    //         return;
    //     }
    //     else{

    //     inorder(root->left,arr);
    //     arr.push_back(root->val);
    //     inorder(root->right,arr);
            
    //     }
    // }
    // vector<int> findMode(TreeNode* root) {
    //     vector<int > arr;
    //     inorder(root , arr);
    //     int n=arr.size();
    //     vector<int> stor;
    //     int cnt=0;
        
        
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n-1;j++){
    //             if(arr[i]==arr[j]){
    //                 cnt++;
    //                 stor.push_back(arr[i]);
    //             }
    //         }
    //     }
    //     return stor;

    vector<int> findMode(TreeNode* root) {
        vector<int> inorderArr;
        inorder(root, inorderArr);

        // Create a map to store frequencies
        unordered_map<int, int> freqMap;
        for (int val : inorderArr) {
            freqMap[val]++; // Increment frequency for each value
        }

        // Find the maximum frequency
        int maxFreq = 0;
        for (auto& pair : freqMap) {
            maxFreq = max(maxFreq, pair.second);
        }

        // Collect the modes (values with maximum frequency)
        vector<int> modes;
        for (auto& pair : freqMap) {
            if (pair.second == maxFreq) {
                modes.push_back(pair.first);
            }
        }

        return modes;
    }

private:
    void inorder(TreeNode* root, vector<int>& arr) {
        if (root == NULL) {
            return;
        }
        inorder(root->left, arr);
        arr.push_back(root->val);
        inorder(root->right, arr);
    }
};

        
    