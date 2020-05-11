package cs.fundamental.data.node;

public class SinglyLinkedListNode<T> {

    // Node Value
    private T value;

    // Next node reference
    private SinglyLinkedListNode<T> nextNode;

    /**
     * Constructor
     * @param value - Node value
     */
    public SinglyLinkedListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SinglyLinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
