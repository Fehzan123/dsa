import java.util.*;
import java.sql.Array;
import java.io.*;


class Pair {
    int x;
    int y;
 
    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
 
// class to define user defined conparator
class Compare {
 
    static void compare(Pair arr[], int n)
    {
        // Comparator to sort the pair according to second
        // element
        Arrays.sort(arr, new Comparator& lt; Pair& gt; () {
            @Override public int compare(Pair p1, Pair p2)
            {
                return p1.y
                    - p2.y; // To compare the first element
                            // just
                            // change the variable from p1.y
                            // - p2.y to p1.x-p2.x.
            }
        });
 
        for (int i = 0; i & lt< n; i++) {
            System.out.print(arr[i].x + " "
                             + arr[i].y + " ");
        }
        System.out.println();
    }
}
 
// Main class

public class sol {
    public static void sortSquares(int arr[])
    {


        Scanner sc = new Scanner(System.in);
 
        // length of array
        int n = 5;
 
        // Array of Pair
        Pair arr[] = new Pair[n];
 
        arr[0] = new Pair(10, 20);
        arr[1] = new Pair(1, 2);
        arr[2] = new Pair(3, 1);
        arr[3] = new Pair(10, 8);
        arr[4] = new Pair(4, 3);
 
        // Creating object of above class inside main method
        Compare obj = new Compare();
 
        obj.compare(arr, n);
    }
}


