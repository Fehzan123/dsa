


public class mis {
    public static String rev(String s) {
       StringBuilder sb=new StringBuilder();
    //    appoch 1
    //    for(int i=0;i<s.length();i++){
    //     char c=s.charAt(i);
    //     int inx=s.indexOf(c,i+1);
    //     if(inx==-1){
    //         sb.append(c);
    //     }
    //    }
    //    return sb.toString();
    char[] ar=s.toCharArray();
    boolean rep=false;
    for(int i=0;i<ar.length;i++){
        for(int j=i+1;j<ar.length;j++){
            if(ar[i]==ar[j]){
                rep=true;
                break;
            }
        }
        if(!rep){
            sb.append(ar[i]);
        }
    }
    return sb.toString();
    }
    public static void main(String[] args) {
       String s="aabcd";
       System.out.println(rev(s));
       
    }
}
