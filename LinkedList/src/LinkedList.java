import org.jetbrains.annotations.NotNull;

public class LinkedList<T> {

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    void insertFirst(Node newNode){
        if (tail == null){
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertLast(Node newNode){
        if (head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertMiddle(Node newNode, Node previous){
        newNode.next = previous.next;
        previous.next = newNode;
    }

    Node search(int value){
        Node tmp;
        tmp = head;
        while (tmp != null){
            if(tmp.data == value){
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
    }

    void deleteLast(){
        Node tmp,previous;
        tmp = head;
        previous = null;
        while (tmp != null){
            previous = tmp;
            tmp = tmp.next;
        }
        if (previous == null){
            head = null;
        }
        else {
            previous.next = null;
        }
        tail = previous;
    }

    void deleteMiddle(Node s){
        Node tmp,previous;
        tmp = head;
        previous = null;
        while (tmp != null){
            previous = tmp;
            tmp = tmp.next;
        }
        previous.next = s.next;
    }


}























