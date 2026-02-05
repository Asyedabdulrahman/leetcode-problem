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
    int index = 0; 
    public TreeNode bstFromPreorder(int[] preorder) {
        return recurseBuild(preorder, Integer.MAX_VALUE);       
    }

    private TreeNode recurseBuild(int[] preorder, int limit){
        if(index == preorder.length || preorder[index] > limit){
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        index++;

        root.left = recurseBuild(preorder, root.val);
        root.right = recurseBuild(preorder, limit);

        return root;
    }
}