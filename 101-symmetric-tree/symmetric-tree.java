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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode val1, TreeNode val2){
        if(val1 == null && val2 == null){
            return true;
        }

        if(val1 == null || val2 == null){
            return false;
        }

        return val1.val == val2.val && isMirror(val1.left, val2.right) && isMirror(val1.right, val2.left);
    }
}