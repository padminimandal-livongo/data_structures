package cs.fundamental.data.structure;

import cs.fundamental.data.node.SinglyLinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


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

    @Test
    @DisplayName("Find first occurance of 4 in a empty list")
    void findFirstOccurrenceEmptyList() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<Integer>();

        SinglyLinkedListNode result = singlyLinkedListDemo.findFirstOccurrence(3);

        assertNull(result);
    }

    @Test
    @DisplayName("Find first occurance of 3 in a list of 1 -> 2 -> 3 -> 4 -> 5")
    void findFirstOccurrence() {
        SinglyLinkedListDemo<Integer> singlyLinkedListDemo = new SinglyLinkedListDemo<Integer>();
        singlyLinkedListDemo.addNode(5);
        singlyLinkedListDemo.addNode(4);
        singlyLinkedListDemo.addNode(3);
        singlyLinkedListDemo.addNode(2);
        singlyLinkedListDemo.addNode(1);

        SinglyLinkedListNode result = singlyLinkedListDemo.findFirstOccurrence(3);

        assertEquals(3, result.getValue());
        assertEquals(4, result.getNextNode().getValue());
    }

    @Test
    @DisplayName("Remove node from a empty list")
    void removeNodeForNull() {
        SinglyLinkedListDemo<String> singlyLinkedListDemo = new SinglyLinkedListDemo<String>();

        SinglyLinkedListNode<String> result = singlyLinkedListDemo.removeNode("Maryland");

        assertNull(result.getValue());
    }

    @Test
    @DisplayName("Remove node 'Maryland' from a  list Temple -> Dallas -> Houston -> Maryland -> Texas")
    void removeNode() {
        String value = "Maryland";
        SinglyLinkedListDemo<String> singlyLinkedListDemo = new SinglyLinkedListDemo<String>();
        singlyLinkedListDemo.addNode("Texas");
        singlyLinkedListDemo.addNode(value);
        singlyLinkedListDemo.addNode("Houston");
        singlyLinkedListDemo.addNode("Dallas");
        singlyLinkedListDemo.addNode("Temple");

        SinglyLinkedListNode<String> result = singlyLinkedListDemo.removeNode(value);

        assertEquals(value, result.getValue());
        assertEquals("Texas", result.getNextNode().getValue());

    }


    @Test
    @DisplayName("Remove node 'Maryland' from a  list Temple -> Dallas -> Houston -> Maryland -> Texas")
    void removeLastNode() {
        SinglyLinkedListDemo<String> singlyLinkedListDemo = new SinglyLinkedListDemo<String>();
        singlyLinkedListDemo.addNode("Texas");
        singlyLinkedListDemo.addNode("Maryland");
        singlyLinkedListDemo.addNode("Houston");
        singlyLinkedListDemo.addNode("Dallas");
        singlyLinkedListDemo.addNode("Temple");

        SinglyLinkedListNode<String> result = singlyLinkedListDemo.removeNode("Texas");

        assertEquals("Texas", result.getValue());
        assertNull(result.getNextNode());

    }

    @Test
    @DisplayName("Remove first node 'Temple' from a  list Temple -> Dallas -> Houston -> Maryland -> Texas")
    void removeFirstNode() {
        SinglyLinkedListDemo<String> singlyLinkedListDemo = new SinglyLinkedListDemo<String>();
        singlyLinkedListDemo.addNode("Texas");
        singlyLinkedListDemo.addNode("Maryland");
        singlyLinkedListDemo.addNode("Houston");
        singlyLinkedListDemo.addNode("Dallas");
        singlyLinkedListDemo.addNode("Temple");

        SinglyLinkedListNode<String> result = singlyLinkedListDemo.removeNode("Temple");

        assertEquals("Temple", result.getValue());
        assertEquals("Dallas", singlyLinkedListDemo.getRoot().getValue());
    }

}
