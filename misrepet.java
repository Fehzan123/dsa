import java.util.*;


public class misrepet {
    public static String rev(String s) {
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
            String s="faizan";
            System.out.println(rev(s));
    }
}
