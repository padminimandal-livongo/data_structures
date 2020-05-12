package cs.fundamental.problems;

import cs.fundamental.node.SinglyLinkedListNode;

public class SinglyLinkedListProblems<T>{

    public boolean findLoopExits(SinglyLinkedListNode<T> root) {
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
}
