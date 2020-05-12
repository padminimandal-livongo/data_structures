package cs.fundamental.node;

/**
 * Node for Singly Linked List
 * @param <T>
 */
public class SinglyLinkedListNode<T> {

    // Node Value
    private T value;

    // Next node reference
    private SinglyLinkedListNode<T> nextNode = null;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinglyLinkedListNode)) return false;

        SinglyLinkedListNode<?> that = (SinglyLinkedListNode<?>) o;

        if (!value.equals(that.value)) return false;
        return nextNode != null ? nextNode.equals(that.nextNode) : that.nextNode == null;
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + (nextNode != null ? nextNode.hashCode() : 0);
        return result;
    }
}
