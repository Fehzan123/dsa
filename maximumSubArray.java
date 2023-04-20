import java.util.*;

public class maximumSubArray {
    public static void main(String[] args) {
        int arr[]={4,-2,-3,4,-1,-2,1,5,-3};
      int maxsofar=Integer.MIN_VALUE;
        int maxendinghere=0;
        for(int i=0;i<arr.length;i++){
            maxendinghere=maxendinghere+arr[i];
            if(maxsofar<maxendinghere){
                maxsofar=maxendinghere;
            }
            if(maxendinghere<0){
                maxendinghere=0;
            }
            
        }
        System.err.println(maxsofar);
    }
}
