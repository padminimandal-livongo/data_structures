package cs.fundamental.problems.leetcode.list;

import cs.fundamental.node.SinglyLinkedListNode;

public class MergeTwoSortedList {

    public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {

        if(l1 == null || l2 == null) {
            return null;
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = newNode;
        while(l1 != null || l2 != null) {
            if(l1.getValue().equals(l2.getValue())) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if(l1 != null) {
            current.next = l1;
        }

        if(l2 != null) {
            current.next = l2;
        }

        return newNode.next;
    }
}
