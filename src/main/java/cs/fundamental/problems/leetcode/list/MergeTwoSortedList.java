package cs.fundamental.problems.leetcode.list;

import cs.fundamental.node.SinglyLinkedListNode;

public class MergeTwoSortedList {

    public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode<Integer> l1, SinglyLinkedListNode<Integer> l2) {

        if (l1 == null || l2 == null) {
            return null;
        }

        SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode(0);
        SinglyLinkedListNode<Integer> current = newNode;
        while (l1 != null && l2 != null) {
            if (l1.getValue() < l2.getValue()) {
                current.setNextNode(l1);
                l1 = l1.getNextNode();
            } else {
                current.setNextNode(l2);
                l2 = l2.getNextNode();
            }
            current = current.getNextNode();
        }

        if (l1 != null) {
            current.setNextNode(l1);
        }

        if (l2 != null) {
            current.setNextNode(l2);
        }

        return newNode.getNextNode();
    }
}
