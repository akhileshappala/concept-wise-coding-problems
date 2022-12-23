/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case if both are null i.e at any level even in last step of iteration i.e if we reach leaf nodes without failing
        if(p == null && q == null ) return true;
        // if either one of the p an q are null but not the other then false
        if(p == null || q == null) return false;
        // if values are not equal then return false;
        if(p.val != q.val) {
            return false;
        }
    
       //like above check for the left and right side of everything
        return (isSameTree(p.left,q.left) && isSameTree(p.right, q.right));
    }
}




