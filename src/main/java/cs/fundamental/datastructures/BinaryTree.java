package cs.fundamental.datastructures;

import cs.fundamental.node.TreeNode;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Getter
public class BinaryTree {

    private TreeNode root;

    public boolean add(int data) {

        if (root == null) {
            root = new TreeNode(data);
            return true;
        }

        return root.addNode(data);
    }

    public List<Integer> preOrderTraversal() {
        List<Integer> traversalList = new LinkedList<>();
        preOrder(root, traversalList);
        return traversalList;
    }

    private void preOrder(TreeNode node, List<Integer> traversalList) {
        if (node == null) {
            return;
        }
        traversalList.add(node.getData());
        preOrder(node.getLeftChild(), traversalList);
        preOrder(node.getRightChild(), traversalList);
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> traversalList = new LinkedList<>();
        inOrder(root, traversalList);
        return traversalList;
    }

    private void inOrder(TreeNode node, List<Integer> traversalList) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftChild(), traversalList);
        traversalList.add(node.getData());
        inOrder(node.getRightChild(), traversalList);
    }

    public List<Integer> postOrderTraversal() {
        List<Integer> traversalList = new LinkedList<>();
        postOrder(root, traversalList);
        return traversalList;
    }

    private void postOrder(TreeNode node, List<Integer> traversalList) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeftChild(), traversalList);
        postOrder(node.getRightChild(), traversalList);
        traversalList.add(node.getData());
    }

    public List<Integer> levelOrder() {
        List<Integer> levelOrder = new LinkedList<>();
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            levelOrder.add(node.getData());
            if (node.getLeftChild() != null) {
                queue.offer(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.offer(node.getRightChild());
            }
        }

        return levelOrder;
    }
}
