import java.util.*;

public class faizan {
    // public static char faiz(int a,int b,int c) {
    //   int n1=Math.abs(c-a);
    //   int n2=Math.abs(c-b);
    //   char ans='a';
    //     if(n1>n2){
    //         ans='s';

    //     }
    //     else if(n1<n2){
    //         ans='n';
    //     }
    //     else if(n1==n2){
    //         ans='d';
    //     }
    //     return ans;
       
    // }
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float root1,root2,imaginary,d;
        // float discriminant;
        d=(b*b)-(4*a*c);
        switch(d > 0){
            case 1: 
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf("%.2f and %.2f",root1,root2);
            break;
            case 0:
            switch(d<0){
                case 1:
                root1=root2=-b/2/(2*a);
                imaginary = Math.sqrt(-d)/(2*a);
                System.out.println("%.2f + i%.2f and %.2f - i%.2f",root1,imaginary,root2,imaginary);
                break;
                case 0:
                root1=root2=-b/(2*a);
                System.out.printf("%.2f and %.2f",root1,root2);
                break;
            }
        }
        
        // int c=sc.nextInt();
      
        
    }
   
    
}
