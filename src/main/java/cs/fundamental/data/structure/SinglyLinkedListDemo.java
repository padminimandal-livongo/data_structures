package cs.fundamental.data.structure;

import cs.fundamental.data.node.SinglyLinkedListNode;

public class SinglyLinkedListDemo<T> {

    // root
    private SinglyLinkedListNode<T> root;

    /**
     * Method to add nodes to the root
     * @param value Data to create node
     */
    public void addNode(T value) {

        // New node with value
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode(value);

        // If root does not exist
        if(root == null) {
            root = newNode;
        }

        // If root exists
        newNode.setNextNode(root);
        root = newNode;
    }

    /**
     * Find first occurrence of the value in the list
     * @param value - Value to search
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

}
