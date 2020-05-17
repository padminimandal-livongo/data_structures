package cs.fundamental.problems;

import cs.fundamental.datastructures.SinglyLinkedListDemo;
import cs.fundamental.node.SinglyLinkedListNode;

/**
 * 1. Given 2 lists - Find first list exists in second list (https://www.geeksforgeeks.org/sublist-search-search-a-linked-list-in-another-list/)
 */
public class TwoListProblems {

    public boolean listAexistsInListB(SinglyLinkedListDemo<Integer> list1,
                                      SinglyLinkedListDemo<Integer> list2) {
        SinglyLinkedListNode<Integer> node = list2.getRoot();
        SinglyLinkedListNode<Integer> tempList1 = list1.getRoot();
        while (node != null) {

            // Backup of next node if match fails to start with
            SinglyLinkedListNode<Integer> tempList2NextNode = node.getNextNode();
            while (tempList1 != null
                    && node != null
                    && node.getValue() == tempList1.getValue()) {
                // Keep incrementing until last node
                tempList1 = tempList1.getNextNode();
                node = node.getNextNode();
            }
            if (tempList1 == null || (tempList1 == null && tempList2NextNode == null)) {
                return true;
            }
            node = tempList2NextNode;
            tempList1 = list1.getRoot();
        }
        return false;
    }
}
