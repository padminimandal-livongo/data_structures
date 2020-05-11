package cs.fundamental.data.structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SinglyLinkedListDemoTest {

    @Test
    @DisplayName("Add node for Integer")
    void testAddNodeWithInteger() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<Integer>();
        singlyLinkedListDemo.addNode(5);


        assertEquals(5, singlyLinkedListDemo.getRoot().getValue());
    }

    @Test
    @DisplayName("Add node for Character")
    void testAddNodeWithCharacter() {
        SinglyLinkedListDemo<Character> singlyLinkedListDemo = new SinglyLinkedListDemo<Character>();
        singlyLinkedListDemo.addNode('a');


        assertEquals('a', singlyLinkedListDemo.getRoot().getValue());
    }
}
