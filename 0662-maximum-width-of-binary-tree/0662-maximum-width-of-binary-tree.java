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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        queue.offer(root);
        indexQueue.offer(0);

        int max = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            int left = 0, right = 0; 

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                int index = indexQueue.poll();

                if(i == 0){
                    left = index;
                }
                if(i == size - 1){
                    right = index;
                }


                if(node.left != null){
                    queue.offer(node.left);
                    indexQueue.offer(index * 2);
                }
                if(node.right != null){
                    queue.offer(node.right);
                    indexQueue.offer(index * 2 + 1);
                }
            }
            max = Math.max(max, right - left + 1);
        } 
        return max;
    }
}