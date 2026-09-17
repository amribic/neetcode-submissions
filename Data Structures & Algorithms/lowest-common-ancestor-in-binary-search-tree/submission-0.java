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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        
        if (p.val < root.val) {
            if (q.val < root.val) {
                return lowestCommonAncestor(root.left, p, q);
            } else {
                return (isDescendant(root, p) && isDescendant(root, q)) ? root : null;
            }
        } else if (p.val > root.val) {
            if (q.val > root.val) {
                return lowestCommonAncestor(root.right, p, q);
            } else {
                return (isDescendant(root, p) && isDescendant(root, q)) ? root : null;
            }
        } else {
            return isDescendant(root, q) ? root : null;
        }
    }

    private boolean isDescendant(TreeNode tree, TreeNode node) {
        if (tree == null || node == null) {
            return false;
        }
        
        if (tree.val == node.val) {
            return true;
        }

        return isDescendant(tree.left, node) || isDescendant(tree.right, node);
    }
}
