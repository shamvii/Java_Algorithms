package algo.binarysearch;

public class App {

    public static void main(String[] args){
System.out.println(BinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0, 7,  9));
    }

    public static int BinarySearch(int [] a, int x){
        int p = 0;
        int r = a.length-1;

        while(p <= r){
            int q = (p+r)/2;
            if(x < a[q]) r = q-1; //r should not point to a.length-1 but more close to p(lower range)
            else if ( x > a[q]) p = q+1;//p should be pointing to other range, the other half
            else return q;
        }
        return -1;
    }

      }