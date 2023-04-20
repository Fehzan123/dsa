import java.util.*;

public class mmsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=arr[0];
        int min=arr[0];
        int inx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                inx=i;
                break;
                // System.out.println(i);
            //    max++;
            }
           
            
        }
        System.out.println(inx);

        // int span=max-min;
        

    }
}
