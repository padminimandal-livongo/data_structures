package cs.fundamental.problems.leetcode.list;

import cs.fundamental.datastructures.SinglyLinkedListDemo;
import cs.fundamental.node.SinglyLinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {

    @Test
    void mergeTwoLists() {

        SinglyLinkedListDemo<Integer> list1 = new SinglyLinkedListDemo<>();
        list1.addNode(4);
        list1.addNode(2);
        list1.addNode(1);

        SinglyLinkedListDemo<Integer> list2 = new SinglyLinkedListDemo<>();
        list2.addNode(4);
        list2.addNode(2);
        list2.addNode(1);

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

        SinglyLinkedListNode<Integer> result = mergeTwoSortedList.mergeTwoLists(list1.getRoot(), list2.getRoot());

        SinglyLinkedListDemo<Integer> expected = new SinglyLinkedListDemo<>();
        list2.addNode(4);
        list2.addNode(4);
        list2.addNode(2);
        list2.addNode(2);
        list2.addNode(1);
        list2.addNode(1);

        SinglyLinkedListNode<Integer> expectedNode = expected.getRoot();
        while (expectedNode != null) {
            Assertions.assertEquals(expectedNode.getValue(), result.getValue());

            expectedNode = expectedNode.getNextNode();
            result = result.getNextNode();
        }
    }

}