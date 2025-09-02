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
    public int maxPathSum(TreeNode root) {
        int[] res = {root.val};
        bst(root, res);
        return res[0];
    };

    private int bst(TreeNode node, int[] res){
        if(node == null) return 0;

        int leftSum = Math.max(0,bst(node.left, res));
        int rightSum = Math.max(0, bst(node.right, res));

        res[0] = Math.max(res[0], leftSum + rightSum + node.val);

        return node.val + Math.max(leftSum, rightSum);
    }
}