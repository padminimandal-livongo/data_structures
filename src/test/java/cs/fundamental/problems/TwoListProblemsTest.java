package cs.fundamental.problems;

import cs.fundamental.datastructures.SinglyLinkedListDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoListProblemsTest {

    @Test
    void listAexistsInListB() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo1 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo1.addNode(20);
        singlyLinkedListDemo1.addNode(10);

        SinglyLinkedListDemo<Integer> singlyLinkedListDemo2 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo2.addNode(20);
        singlyLinkedListDemo2.addNode(10);
        singlyLinkedListDemo2.addNode(5);

        TwoListProblems twoListProblems = new TwoListProblems();
        boolean result = twoListProblems.listAexistsInListB(singlyLinkedListDemo1, singlyLinkedListDemo2);
        assertTrue(result);
    }

    @Test
    void listAexistsInListB2() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo1 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo1.addNode(1);
        singlyLinkedListDemo1.addNode(2);
        singlyLinkedListDemo1.addNode(3);
        singlyLinkedListDemo1.addNode(4);


        SinglyLinkedListDemo<Integer> singlyLinkedListDemo2 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo2.addNode(1);
        singlyLinkedListDemo2.addNode(2);
        singlyLinkedListDemo2.addNode(1);
        singlyLinkedListDemo2.addNode(2);
        singlyLinkedListDemo2.addNode(3);
        singlyLinkedListDemo2.addNode(4);

        TwoListProblems twoListProblems = new TwoListProblems();
        boolean result = twoListProblems.listAexistsInListB(singlyLinkedListDemo1, singlyLinkedListDemo2);
        assertTrue(result);
    }

    @Test
    void listAexistsInListB3() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo1 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo1.addNode(1);
        singlyLinkedListDemo1.addNode(2);
        singlyLinkedListDemo1.addNode(3);
        singlyLinkedListDemo1.addNode(4);


        SinglyLinkedListDemo<Integer> singlyLinkedListDemo2 = new SinglyLinkedListDemo<>();
        singlyLinkedListDemo2.addNode(1);
        singlyLinkedListDemo2.addNode(2);
        singlyLinkedListDemo2.addNode(2);
        singlyLinkedListDemo2.addNode(1);
        singlyLinkedListDemo2.addNode(2);
        singlyLinkedListDemo2.addNode(3);

        TwoListProblems twoListProblems = new TwoListProblems();
        boolean result = twoListProblems.listAexistsInListB(singlyLinkedListDemo1, singlyLinkedListDemo2);
        assertFalse(result);
    }
}