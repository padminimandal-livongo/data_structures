package cs.fundamental.problems;

import cs.fundamental.datastructures.SinglyLinkedListDemo;
import cs.fundamental.node.SinglyLinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SinglyLinkedListProblemsTest {

    @Test
    void findLoopExits() {
        Integer[] data = new Integer[]{1, 2, 5, 8, 10, 20, 30, 40, 8};
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<>();
        SinglyLinkedListNode<Integer> elementToLoop = null;
        for (int i = 0; i < data.length; i++) {
            if (i == 3) {
                elementToLoop = singlyLinkedListDemo.addNode(data[i]);
            }
        }

        singlyLinkedListDemo.dontUseAddNodeAtLast(elementToLoop);

        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        boolean result = singlyLinkedListProblems.findLoopExitsUsingHareAndTortoiseMethod(singlyLinkedListDemo.getRoot());
        Assertions.assertTrue(result);
    }

    @Test
    void findLoopExits2() {
        Integer[] data = new Integer[]{2, 0, 6, 3, 1, 6, 6, 3, 1, 6, 6, 3, 1, 6};
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<>();
        SinglyLinkedListNode<Integer> elementToLoop = null;
        for (int i = 0; i < data.length; i++) {
            if (i == 3) {
                elementToLoop = singlyLinkedListDemo.addNode(data[i]);
            } else {
                singlyLinkedListDemo.addNode(data[i]);
            }
        }

        //singlyLinkedListDemo.dontUseAddNodeAtLast(elementToLoop);

        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        boolean result = singlyLinkedListProblems.findLoopExitsUsingHareAndTortoiseMethod(singlyLinkedListDemo.getRoot());
        Assertions.assertTrue(result);
    }

    @Test
    void findLoopExitsEmptyList() {
        Integer[] data = new Integer[]{};
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<Integer>();
        for (Integer value : data) {
            singlyLinkedListDemo.addNode(value);
        }
        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        boolean result = singlyLinkedListProblems.findLoopExitsUsingHareAndTortoiseMethod(singlyLinkedListDemo.getRoot());
        Assertions.assertFalse(result);
    }

    @Test
    void findLoopExitsNoLoop() {
        Integer[] data = new Integer[]{1, 2, 5, 8, 10, 20, 30, 40};
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<Integer>();
        for (Integer value : data) {
            singlyLinkedListDemo.addNode(value);
        }

        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        boolean result = singlyLinkedListProblems.findLoopExitsUsingHareAndTortoiseMethod(singlyLinkedListDemo.getRoot());
        Assertions.assertFalse(result);
    }

    @Test
    void findLoopExistsUsingHashingMethod() {
        Integer[] data = new Integer[]{1, 2, 5, 8, 10, 20, 30, 40};
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<>();
        SinglyLinkedListNode<Integer> elementToLoop = null;
        for (int i = 0; i < data.length; i++) {
            if (i == 3) {
                elementToLoop = singlyLinkedListDemo.addNode(data[i]);
            }
        }

        singlyLinkedListDemo.dontUseAddNodeAtLast(elementToLoop);

        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<>();
        boolean result = singlyLinkedListProblems.findLoopExistsUsingHashingMethod(singlyLinkedListDemo.getRoot());
        Assertions.assertTrue(result);
    }
}