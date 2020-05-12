package cs.fundamental.data.problems;

import cs.fundamental.data.node.SinglyLinkedListNode;
import cs.fundamental.data.structure.SinglyLinkedListDemo;

public class SinglyLinkedListProblems<T>{


    public boolean findLoopExits(T[] values) {
        SinglyLinkedListDemo<T> singlyLinkedListDemo = new SinglyLinkedListDemo<T>();
        for(T value: values) {
            singlyLinkedListDemo.addNode(value);
        }

        if(singlyLinkedListDemo.getRoot() != null && singlyLinkedListDemo.getRoot().getNextNode() != null
                && singlyLinkedListDemo.getRoot().getNextNode().getNextNode() != null) {
            SinglyLinkedListNode<T> hare = singlyLinkedListDemo.getRoot();
            SinglyLinkedListNode<T> tortoise = singlyLinkedListDemo.getRoot().getNextNode().getNextNode();

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
