link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      // the main intuition is where ever the separation of both p and q happens, will be the LCA 
        // 1. if both values are greater than root - then we need to check the LCA for right subtree
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
       // 2. if both values are less than root - then we need to check the LCA for left subtree
        else if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
       //3. If any one of the value is equal to root, then return root
        else if(p.val == root.val || q.val == root.val){ 
            return root;
        }
        //4. if above cases are failed means one is one left and other is on right - so return root
        else { return root;}
    }
}
