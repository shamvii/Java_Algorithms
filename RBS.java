package algo.binarysearch;

public class App {

    public static void main(String[] args){
System.out.println(recursiveBinarySearch(new int[] {1,5,6,10,12,42,76,88}, 0, 7, 88));
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

    public static int recursiveBinarySearch(int [] a, int p, int r, int x){
        System.out.println("[ " + p + "..." + r + " ]");
      if(p > r){
          return -1;
      } else {
          int q = (p+r)/2;
          if(a[q] == x){
              return q;
          } else if (a[q] > x ){
              return recursiveBinarySearch(a, p, q-1, x);

          } else {
              return recursiveBinarySearch(a, p+1, r, x);
          } 

      }







    }
}
