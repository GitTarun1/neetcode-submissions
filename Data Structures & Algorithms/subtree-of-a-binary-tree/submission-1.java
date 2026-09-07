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
    static boolean helper2(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;

        boolean left = helper2(root.left,subRoot.left);
        boolean right = helper2(root.right,subRoot.right);

        return left && right;
    }
    static boolean helper1(TreeNode root,TreeNode subRoot){
        if(root == null) return false;
        if(root.val == subRoot.val) {
            if(helper2(root,subRoot)){
                return true;
            }
        }
        return helper1(root.left,subRoot) || helper1(root.right,subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      
        return helper1(root,subRoot);
        
    }
}
