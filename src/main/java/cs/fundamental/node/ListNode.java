package cs.fundamental.node;

public class ListNode {

    public int value;
    public ListNode next;

    public ListNode(int x) {
        value = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
