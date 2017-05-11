package ds.doublylinkedlist;

/**
 * Created by shambhavishukla on 5/4/17.
 */
public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void displayNode() {
        System.out.println("{" + data + "}");
    }
}

