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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            if (root.right != null) {
                TreeNode tmp = new TreeNode(root.right.val, root.right.left, root.right.right);
                root.right = invertTree(root.left);
                root.left = invertTree(tmp);
            } else if (root.left != null) {
                root.right = invertTree(root.left);
                root.left = null;
            }
            return root;
        }
    }
}