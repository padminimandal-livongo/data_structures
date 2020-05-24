package cs.fundamental.problems.leetcode.list;

import cs.fundamental.node.ListNode;
import org.junit.jupiter.api.Test;

class ReverseListProblemsTest {

    ListNode getInputData(int[] inputData) {
        //1->2->3->4->5
        ListNode root = null;

        for (int i = inputData.length - 1; i >= 0; i--) {
            ListNode node = new ListNode(inputData[i]);
            node.next = root;
            root = node;
        }

        return root;
    }

//    @Test
//    void reverseKListNode() {
//
//        ReverseListProblems reverseListProblems = new ReverseListProblems();
//        int[] inputData = {1, 2, 3, 4, 5};
//
//        ListNode result = reverseListProblems.reverseAtKListNode(getInputData(inputData), 3);
//
//        int[] expected = {3, 2, 1, 4, 5};
//
//        ListNode expectedNode = getInputData(expected);
//        while(expectedNode != null) {
//            assertEquals(expectedNode.value, result.value);
//            result = result.next;
//            expectedNode = expectedNode.next;
//        }
//
//    }
//
//    @Test
//    void reverseKListNode2() {
//
//        ReverseListProblems reverseListProblems = new ReverseListProblems();
//        int[] inputData = {1, 2, 3, 4, 5};
//
//        ListNode result = reverseListProblems.reverseAtKListNode(getInputData(inputData), 2);
//
//        int[] expected = { 2, 1, 3, 4, 5};
//
//        ListNode expectedNode = getInputData(expected);
//        while(expectedNode != null) {
//            assertEquals(expectedNode.value, result.value);
//            result = result.next;
//            expectedNode = expectedNode.next;
//        }
//
//    }

    @Test
    void reverseKListNode1() {

        ReverseListProblems reverseListProblems = new ReverseListProblems();
//        int[] inputData = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        ListNode result ;//reverseListProblems.(getInputData(inputData), 3);
//
//        int[] expected = { 3, 2, 1, 6, 5, 4, 7};
//
//        ListNode expectedNode = getInputData(expected);
//        while(expectedNode != null) {
//            assertEquals(expectedNode.value, result.value);
//            result = result.next;
//            expectedNode = expectedNode.next;
//        }
    }
}