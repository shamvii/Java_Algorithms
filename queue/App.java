package ds.queue;

/**
 * Created by shambhavishukla on 5/4/17.
 */
public class App {

    public static void main(String[] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(11);
        //myQueue.insert(44);


        myQueue.view();
    }
}
