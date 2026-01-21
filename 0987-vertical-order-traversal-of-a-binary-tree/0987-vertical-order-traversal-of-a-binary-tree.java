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
    List<int[]> nodeList = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverseTree(root, 0, 0);

        Collections.sort(nodeList, (nodeA, nodeB) -> {
            if(nodeA[0] != nodeB[0]){
                return Integer.compare(nodeA[0], nodeB[0]);
            }
            if(nodeA[1] != nodeB[1]){
                return Integer.compare(nodeA[1], nodeB[1]);
            }
            return Integer.compare(nodeA[2], nodeB[2]);
        });

        List<List<Integer>> result = new ArrayList<>();
        int previousColumn = Integer.MIN_VALUE;

        for(int[] nodeInfo : nodeList){
            int column = nodeInfo[0];
            int nodeValue = nodeInfo[2];
            
            if(previousColumn != column){
                result.add(new ArrayList<>());
                previousColumn = column;
            }
            result.get(result.size() - 1).add(nodeValue);
        }
        return result;
    }

    private void traverseTree(TreeNode root, int row, int col){
        if(root == null){
            return;
        }

        nodeList.add(new int[] {col, row, root.val});

        traverseTree(root.left, row + 1, col - 1);
        traverseTree(root.right, row + 1, col + 1);
    }
}