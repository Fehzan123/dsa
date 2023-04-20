import java.util.*;
// import java.math.MathContext;


public class rootm {
    static void printValue(int digit)
    {
     
        // Switch block to check for each digit c
        switch (digit)
        {
     
        // For digit 0
        case '0':
            System.out.print("Zero ");
            break;
     
        // For digit 1
        case '1':
            System.out.print("One ");
            break;
     
        // For digit 2
        case '2':
            System.out.print("Two ");
            break;
     
        // For digit 3
        case '3':
            System.out.print("Three ");
            break;
     
        // For digit 4
        case '4':
            System.out.print("Four ");
            break;
     
        // For digit 5
        case '5':
            System.out.print("Five ");
            break;
     
        // For digit 6
        case '6':
            System.out.print("Six ");
            break;
     
        // For digit 7
        case '7':
            System.out.print("Seven ");
            break;
     
        // For digit 8
        case '8':
            System.out.print("Eight ");
            break;
     
        // For digit 9
        case '9':
            System.out.print("Nine ");
            break;
        }
    }
     
    // Function to iterate through every
    // digit in the given number
    static int printWord(int N)
    {
       
     
        // Finding each digit of the number
        for ( int i = 0; i <N; i++)
        {
     
            // Print the digit in words
          System.out.println(printValue(digit));
        }
        return N;
    }
     
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in) ;
        int N = sc.nextInt();
        printWord(N);
    }
}
