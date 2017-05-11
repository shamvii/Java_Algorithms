package ds.stack;

/**
 * Created by shambhavishukla on 5/4/17.
 */
public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(50);
        theStack.push(10);
        theStack.push(60);

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

    }

}
