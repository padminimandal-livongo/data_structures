package cs.fundamental.problems;

import cs.fundamental.node.SinglyLinkedListNode;

import java.util.HashSet;

/**
 * 1. Find Loop using Hare and Tortoise method - findLoopExitsUsingHareAndTortoiseMethod
 * 2. Find loop using HashSet method - findLoopExistsUsingHashingMethod
 *
 * @param <T>
 */
public class SinglyLinkedListProblems<T>{

    /**
     * Detect/ Find if loop exists in Singly Linked List using Hare and Tortoise Algorithm
     * This is also known as Floyd’s Cycle-Finding Algorithm
     * @param root - Root of the Singly Linked List
     * @return Boolean if loop detected or not
     */
    public boolean findLoopExitsUsingHareAndTortoiseMethod(SinglyLinkedListNode<T> root) {
        if(root != null && root.getNextNode() != null
                && root.getNextNode().getNextNode() != null) {
            SinglyLinkedListNode<T> tortoise = root;
            SinglyLinkedListNode<T> hare = root.getNextNode().getNextNode();

            while(hare != null && hare.getNextNode() != null
                    && hare.getNextNode().getNextNode() != null
                    && tortoise != null) {
                if(hare.getValue() == tortoise.getValue()) {
                    return true;
                }
                tortoise = tortoise.getNextNode();
                hare = hare.getNextNode().getNextNode();
            }
        }

        return false;
    }

    public boolean findLoopExistsUsingHashingMethod(SinglyLinkedListNode<T> root) {

        HashSet<T> hashSet = new HashSet<>();

        while(root != null) {
            if(hashSet.contains(root.getValue())) {
                return true;
            }
            hashSet.add(root.getValue());
            root = root.getNextNode();
        }
        return false;
    }
}
