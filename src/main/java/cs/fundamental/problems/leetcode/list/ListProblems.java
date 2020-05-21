package cs.fundamental.problems.leetcode.list;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class ListProblems {

    public Node copyRandomList(Node head) {

        Node current = head;
        Node secondList = new Node(-1);
        Node newHead = secondList;
        // Creation of the new list of nodes
        while(current != null) {
            newHead.next = new Node(current.val);
            newHead.random = current.random;
            current = current.next;
            newHead = newHead.next;
        }

        current = head; // Resetting the current Node to restart the
        Node newListItr = secondList.next;
        while(current != null) {
            current.next = newListItr.next;
            current = current.next;
            newListItr = newListItr.next;
        }

        current = head; // Resetting the current Node to restart the
        newListItr = secondList.next;
        while(current.next != null) {
            newListItr.random = current.random.next;
            current = current.next;
            newListItr = newListItr.next;
        }

        return newHead.next;
    }
}
