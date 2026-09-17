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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null) {
            return false;
        }

        if (sameTree(root, subRoot)) {
            return true;
        }

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return left || right;
    }

    private boolean sameTree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else if (tree1 != null && tree2 == null) {
            return false;
        } else if (tree1 == null && tree2 != null) {
            return false;
        }

        if (tree1.val != tree2.val) {
            return false;
        } else {
            return sameTree(tree1.left, tree2.left) && sameTree(tree1.right, tree2.right);
        }
    }
}
