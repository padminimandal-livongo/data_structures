package cs.fundamental.datastructures;

import cs.fundamental.node.SinglyLinkedListNode;

/**
 * All about Singly List Data Structure
 * @author Padmini
 * @param <T>
 */
public class SinglyLinkedListDemo<T> {

    // root
    private SinglyLinkedListNode<T> root;

    /**
     * Method to add nodes to the root
     * @param value Data to create node
     */
    public SinglyLinkedListNode<T> addNode(T value) {

        // New node with value
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode(value);

        // If root does not exist
        if(root == null) {
            root = newNode;
            return root;
        }

        // If root exists
        newNode.setNextNode(root);
        root = newNode;
        return root;
    }

    /**
     * Do Not Use - This is for creating a loop in the Singly linked list
     * @param node
     */
    public void dontUseAddNodeAtLast(SinglyLinkedListNode<T> node) {

        if(root == null) {
            root = node;
        }

        SinglyLinkedListNode<T> current = root;
        while(current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(node);
    }

    /**
     * Find first occurrence of the value in the list
     * @param value - Value to BinarySearch
     * @return Found node
     */
    public SinglyLinkedListNode<T> findFirstOccurrence(T value) {

        // Root does not exist
        if(root == null) {
            return null;
        }

        // Root exists
        SinglyLinkedListNode currentNode = root;
        while(currentNode != null) {
            if(currentNode.getValue() == value) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public SinglyLinkedListNode<T> getRoot() {
        return root;
    }


    /**
     * Remove or Delete node from Singly linked list
     * @param value - Value to delete
     * @return Object that is deleted or removed
     */
    public SinglyLinkedListNode<T> removeNode(T value) {

        // If root does not exist
        if(root == null) {
            return null;
        }

        // If root exist and root itself is the node to be removed
        if(root.getValue() == value) {
            SinglyLinkedListNode<T> temp = root;
            root = temp.getNextNode();
            return temp;
        }

        // If root exist
        SinglyLinkedListNode<T> currentNode = root;
        // Reference to previous node
        SinglyLinkedListNode<T> prevNode = root;
        while(currentNode != null) {
            if(currentNode.getValue() == value) {
                // Found the node perform delete operation
                prevNode.setNextNode(currentNode.getNextNode());
                return currentNode;
            }
            // Set previous and next node
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

}
