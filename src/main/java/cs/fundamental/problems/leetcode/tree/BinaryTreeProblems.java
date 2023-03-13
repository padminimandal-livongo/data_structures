package cs.fundamental.problems.leetcode.tree;

import cs.fundamental.node.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeProblems {

    /**
     * Same Tree vs Symmetric Tree is different
     Same Tree is compared to itself with value to value and left to left and right to right 
     Where as in Symmetric 
     value to value 
     left to right 
     right to left child is compared to check for mirror 
     (Mirror Image of itself) https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
     *
     * @param root1 - Tree 1 root node
     * @param root2 - Tree 2 root node
     * @return boolean indicating if the trees are symmetric or not
     */
    public boolean checkIfSameTree(TreeNode root1, TreeNode root2) {

        // If both the nodes are null return true
        if (root1 == null && root2 == null) {
            return true;
        }

        // If either of the nodes are null return false
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check for root data, left and right child in recursive
        return root1.getData() == root2.getData()
                && checkIfSameTree(root1.getLeftChild(), root2.getLeftChild())
                && checkIfSameTree(root1.getRightChild(), root2.getRightChild());
    }

    /**
    (Mirror Image of itself) https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
    */
    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) {
            return true;
        }

        if(node1 != null && node2 != null && node1.value == node2.value) {
            return (isSymmetric(node1.leftChild, node2.rightChild))
                    && (isSymmetric(node1.rightChild, node2.leftChild));
        }

        return false;
    }
    
    /**
     * Get maximum height of the tree
     *
     * @param root - Root node to start
     * @return int value of the height
     */
    public int treeHeight(TreeNode root) {
        // If node is null break point return 0
        if (root == null) {
            return 0;
        }

        // Get Left and Right Node height
        int leftHeight = treeHeight(root.getLeftChild());
        int rightHeight = treeHeight(root.getRightChild());

        // Add current node + Max of left or right child
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public List<Integer> rootToLeafSum(TreeNode root, int sum) {
        List<Integer> nodes = new LinkedList<>();
        boolean result = rootToLeafSum(root, sum, nodes);
        if (!result) {
            return null;
        }
        return nodes;
    }

    private boolean rootToLeafSum(TreeNode root, int sum, List<Integer> nodes) {

        if (root == null) {
            return false;
        }

        if (root.getLeftChild() == null
                && root.getRightChild() == null) {
            if (root.getData() == sum) {
                nodes.add(root.getData());
                return true;
            } else {
                return false;
            }
        }

        if (rootToLeafSum(root.getLeftChild(), sum - root.getData(), nodes)) {
            nodes.add(root.getData());
            return true;
        }

        if (rootToLeafSum(root.getRightChild(), sum - root.getData(), nodes)) {
            nodes.add(root.getData());
            return true;
        }

        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null) {
            return null;
        }

        if (root == node1 || root == node2) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.getLeftChild(), node1, node2);
        TreeNode right = lowestCommonAncestor(root.getRightChild(), node1, node2);

        if (left != null && right != null) {
            return root;
        }

        if (left == null && right == null) {
            return null;
        }

        return (left == null) ? right : left;
    }
}
