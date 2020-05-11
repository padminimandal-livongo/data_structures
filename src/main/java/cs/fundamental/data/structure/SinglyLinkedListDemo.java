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

    public SinglyLinkedListNode<T> getRoot() {
        return root;
    }


}
