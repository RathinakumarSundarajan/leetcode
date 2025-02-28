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
//  A Balanced Binary Tree is a binary tree where the height of the left and right subtrees of every node differ by at most one. 
class Solution {
    public boolean isBalanced(TreeNode root) { 
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // Base case: height of an empty tree is 0
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // If any subtree is unbalanced, return -1 immediately
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        // If height difference is more than 1, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise, return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
