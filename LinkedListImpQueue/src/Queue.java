public class Queue {
    Node first;
    Node last;

    public Queue() {
        first = null;
        last = null;

    }
    boolean isEmpty() {
        if (first == null) {
            return true;
        }
        else {
            return false;
        }
    }
    void enqueue(Node node) {
        if (!isEmpty()) {
            last.next = node;
        }
        else {
            first = node;
        }
        last = node;

    }
    Node dequeue() {
        Node temp = first;
        temp = first;
        if (!isEmpty()) {
            first = first.next;
            if (first == null) {
                last = null;
            }
        }
        return temp;
    }
}

