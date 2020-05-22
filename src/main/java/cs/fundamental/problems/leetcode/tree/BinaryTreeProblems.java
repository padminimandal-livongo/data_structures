package cs.fundamental.problems.leetcode.tree;

import cs.fundamental.node.TreeNode;

public class BinaryTreeProblems {

    /**
     * Symmetric Tree (Mirror Image of itself) https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
     * @param root1 - Tree 1 root node
     * @param root2 - Tree 2 root node
     * @return boolean indicating if the trees are symmetric or not
     */
    public boolean checkIfSameTree(TreeNode root1, TreeNode root2) {

        // If both the nodes are null return true
        if(root1 == null && root2 == null) {
            return true;
        }

        // If either of the nodes are null return false
        if(root1 == null || root2 == null) {
            return false;
        }

        // Check for root data, left and right child in recursive
        return root1.getData() == root2.getData()
                && checkIfSameTree(root1.getLeftChild(), root2.getLeftChild())
                && checkIfSameTree(root1.getRightChild(), root2.getRightChild());
    }


    public int treeHeight(TreeNode root) {
        // If node is null break point return 0
        if(root == null) {
            return 0;
        }

        // Get Left and Right Node height
        int leftHeight = treeHeight(root.getLeftChild());
        int rightHeight = treeHeight(root.getRightChild());

        // Add current node + Max of left or right child
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
