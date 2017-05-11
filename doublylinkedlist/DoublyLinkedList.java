package ds.doublylinkedlist;

/**
 * Created by shambhavishukla on 5/5/17.
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;

    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;


    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;

        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first; // we start from the beginning fo the list
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }

        }
        return true;
    }

}

