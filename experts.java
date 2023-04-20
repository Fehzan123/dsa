
import java.util.*;

public class experts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int t=i*6;
            for(int j=0;j<N;j++){
                int k=j*4;
                System.out.println(t+k+" ");
            }
        }
    }
}
