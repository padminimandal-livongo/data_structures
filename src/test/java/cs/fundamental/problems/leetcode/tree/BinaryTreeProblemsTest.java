package cs.fundamental.problems.leetcode.tree;

import cs.fundamental.datastructures.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeProblemsTest {

    @Test
    void checkIfSameTree() {
        BinaryTreeProblems binaryTreeProblems = new BinaryTreeProblems();

        // Tree 1 and Tree 2
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        for (int i = 0; i < 20; i++) {
            int randomData = new Random().nextInt();
            tree1.add(randomData);
            tree2.add(randomData);
        }

        boolean result = binaryTreeProblems.checkIfSameTree(tree1.getRoot(), tree2.getRoot());
        assertTrue(result);
    }

    @Test
    void treeHeight() {
        BinaryTreeProblems binaryTreeProblems = new BinaryTreeProblems();

        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(60);
        tree.add(40);
        tree.add(20);
        tree.add(30);
        tree.add(15);
        tree.add(55);
        tree.add(65);
        tree.add(54);
        tree.add(56);
        tree.add(64);
        tree.add(70);
        tree.add(63);

        int result = binaryTreeProblems.treeHeight(tree.getRoot());
        assertEquals(5, result);
    }

    @Test
    void treeHeight2() {
        BinaryTreeProblems binaryTreeProblems = new BinaryTreeProblems();

        BinaryTree tree = new BinaryTree();
        tree.add(100);
        tree.add(80);
        tree.add(70);
        tree.add(60);
        tree.add(50);
        tree.add(40);
        tree.add(30);
        tree.add(20);
        tree.add(10);

        int result = binaryTreeProblems.treeHeight(tree.getRoot());
        assertEquals(9, result);
    }
}