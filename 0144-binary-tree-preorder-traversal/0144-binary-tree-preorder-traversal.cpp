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

 /*
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root){
        // vector<int> result;

        preorderTraverse(root,result);
        return result;

    }
        void preorderTraverse(TreeNode* root,vector<int> &result){

        if(root==NULL){

            return;
        }

        result.push_back(root->val);

        preorderTraverse(root->left,result);
        preorderTraverse(root->right,result);
   
        } 
};
*/

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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        preorderhelper(root,result);
        return result;
    }
private: 
    void preorderhelper(TreeNode* root,vector<int> &result){
        if(root == NULL){
            return;
        }
        result.push_back(root->val);
        preorderhelper(root->left,result);
        preorderhelper(root->right,result);
    }
};
