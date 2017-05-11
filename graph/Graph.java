package ds.graph;
import java.util.ArrayList;
/**
 * Created by shambhavishukla on 5/8/17.
 */
public class Graph {

    private int vCount; //number of vertices
    private int eCount; //number of edges

    private ArrayList[] adjacents; //array of integer lists

    public Graph(int vCount){
        this.vCount = vCount;
        this.eCount = 0;
        adjacents = new ArrayList [vCount];

        for(int i = 0; i < vCount; i++){
            adjacents[i] = new ArrayList<Integer>();
        }
    }
}
