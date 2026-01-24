/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    Set<TreeNode> visited = new HashSet();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildMap(root);
        FindTarget(target, 0, k);
        return result;
    }

    private void buildMap(TreeNode node){
        if(node.left != null){
            parentMap.put(node.left, node);
            buildMap(node.left);
        }
        if(node.right != null){
            parentMap.put(node.right, node);
            buildMap(node.right);
        }
    }

    private void FindTarget(TreeNode node, int distance, int k){
        if(node == null || visited.contains(node)){
            return;
        }
        visited.add(node);

        if(distance == k){
            result.add(node.val);
            return;
        }

        if(node.left != null){
            FindTarget(node.left, distance + 1, k);
        }

        if(node.right != null){
            FindTarget(node.right, distance + 1, k);
        }

        if(parentMap.get(node) != null){
            FindTarget(parentMap.get(node), distance + 1, k);
        }
    }
}