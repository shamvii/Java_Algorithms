package algo.linearsearch;

public class App {

    public static void main(String[] args){
        linearSearch(new int[] {1, 4, 0, 5, 8, 10, 11}, 5);

    }

    public static int linearSearch(int [] a, int x){
        for(int i = 0; i < a.length; i++){
            if (a[i] == x) {
                System.out.println("The index is: " + i);
                return i;
            }
        }
        return -1;
    }
}