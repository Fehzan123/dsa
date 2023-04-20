import java.util.*;


public class primArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=2;
        int counter=0;
      int a[]=new int[m];
       
        
       while(counter<m){
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                flag=false;
                break;
            }
        }
        if(flag){
            a[counter]=n;
            counter=counter+1;
        }
        n=n+1;
       }
       for(int i=0;i<=a.length;i++){
        System.out.println(a[i]);
       }
       
    }
}
