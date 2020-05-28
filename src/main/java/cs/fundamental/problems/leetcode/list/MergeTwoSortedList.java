package cs.fundamental.problems.leetcode.list;

import cs.fundamental.node.SinglyLinkedListNode;

/**
 * Merge 2 sorted list
 */
public class MergeTwoSortedList {

    /**
     * Merge 2 sorted list
     * Time Complexity: O(N + M)
     * Space Complexity: O(N+M)
     *
     * @param l1 - List 1
     * @param l2 - List 2
     * @return Merged list
     */
    public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode<Integer> l1, SinglyLinkedListNode<Integer> l2) {
        // Return either of the list when null
        if (l1 == null || l2 == null) {
            return (l1 == null) ? l2 : l1;
        }

        SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<>(-1);
        SinglyLinkedListNode<Integer> current = newNode;

        // Loop until both the list nodes are not null
        while (l1 != null && l2 != null) {
            if (l1.getValue() > l2.getValue()) {
                current.setNextNode(l1);
                l1 = l1.getNextNode();
            } else {
                current.setNextNode(l2);
                l2 = l2.getNextNode();
            }
            current = current.getNextNode();
        }

        // Loop rest of the list1
        while (l1 != null) {
            current.setNextNode(l1);
            l1 = l1.getNextNode();
            current = current.getNextNode();
        }

        // Loop rest of the list2
        while (l2 != null) {
            current.setNextNode(l2);
            l2 = l2.getNextNode();
            current = current.getNextNode();
        }

        // Return new list reference node
        return newNode.getNextNode();
    }
}
