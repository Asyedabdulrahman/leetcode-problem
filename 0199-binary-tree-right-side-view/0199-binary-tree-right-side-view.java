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
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return result;    
    }

    private void dfs(TreeNode root, int level){
        if(root == null){
            return; 
        }

        if(level == result.size()){
            result.add(root.val);
        }

        dfs(root.right, level + 1);
        dfs(root.left, level + 1);


    }
}


// do a recurseive dfs at a time for left and right , if right has value means add it on the result
//if right does'nt has the node, means then i will add left node