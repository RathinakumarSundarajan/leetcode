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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // List to store the traversal result
        preOrder(root, result); // Start the traversal
        return result; // Return the result
    }

     private void preOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case: if the node is null, do nothing
        }
        result.add(node.val); // Visit the root node
        preOrder(node.left, result); // Traverse the left subtree
        preOrder(node.right, result); // Traverse the right subtree
    }
}