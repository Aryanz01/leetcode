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

void inorder(TreeNode* root,vector<int> &arr){
    if(root==NULL){
        return;
    }
    else{
        inorder(root->left, arr);
        arr.push_back(root->val);
        inorder(root->right, arr);
    }

}
    bool isValidBST(TreeNode* root) {
        vector<int> arr;

        inorder(root, arr);

        for(int i=0; i<arr.size()-1;i++){
            if(arr[i]>=arr[i+1] ){
                return false;
            }
        }
        return true;
    }
};


// TreeNode* temp=root;
        
//         if(root==NULL){
//             return true;
//         }
//         while(temp->left){
//             temp=temp->left;
//             if(temp->val>temp->left->val){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }
        
//         while(temp->right){
//             temp=temp->right;
//             if(temp->val<temp->right->val){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         return false;
//     }