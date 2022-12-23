// link 
https://leetcode.com/problems/subtree-of-another-tree/description/


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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //1. if subroot is null, i.e only root is there then its a subtree of iteself - true
        if(subRoot == null )  return true;
        //2. if root itself is none, but we have subroot - false
        if(root == null) return false;
        //3. if with that root and subroot, we will check whether its same tree -- true
        if(isSametree(root,subRoot)) return true;
        //4. if above fails, we check with the subtree of left and right with subroot, if any one satisfies - true
        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));

    }

    public boolean isSametree(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.val != t.val) return false;

        return (isSametree(s.left, t.left) && isSametree(s.right, t.right));
        
    }
}
