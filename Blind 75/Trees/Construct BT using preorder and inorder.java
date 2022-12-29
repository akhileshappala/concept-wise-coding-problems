


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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0 ) return null;
       //1. The 1st element of the preorder is the root of the tree
        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0 ;
      //2. Search that 1st element in the inorder traversal, that is mid, left of mid is belongs to the left tree 
      // and right of mid belongs to the right subtree, do the recursive for the same 
        for(int i =0; i<inorder.length;i++){
            if(preorder[0] == inorder[i]) mid = i;
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1 , mid+1), 
                            Arrays.copyOfRange(inorder, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(preorder, mid+1, preorder.length),
                            Arrays.copyOfRange(inorder, mid+1, inorder.length));


        return root;
    }
}
