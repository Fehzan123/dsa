import java.util.Arrays;

public class asad {
    public static void main(String[] arg) {
        String a="i am faizan A";
        // String s="";
        int c=0;
        for(int i=a.length()-1;i>=0;i--){
          if(a.charAt(i)=='a' || a.charAt(i)=='A'){
            c++;
          }
        }
        // String t="";
       
        System.out.println("counting a is "+c);
      
    }
}
