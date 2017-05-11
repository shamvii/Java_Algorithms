package ds.queue;

/**
 * Created by shambhavishukla on 5/4/17.
 */
public class Queue {

    private int maxSize; // initializes set number of slots
    private long[] queArray; // slot to main the array
    private int front; //front element index position
    private int rear; //end index position
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;//index posiiton of frst
        rear = -1; //no items in the array
        nItems = 0;
    }

    public void insert(long j){
        //if(rear == maxSize -1){
        //    rear = -1;
       // }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front  = 0;

        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }


    public boolean isEmpty(){
        return (nItems ==0 );
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void view(){
        System.out.println("[");
        for(int i =0; i<queArray.length; i++) {
            System.out.println(queArray[i] + " ");
        }
        System.out.println("]");
    }
}
