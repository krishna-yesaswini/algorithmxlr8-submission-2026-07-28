import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length()!=t.length()) {
            System.out.println("false");
            return;
        }
        HashSet<Character>set=new HashSet<>();

       for(int i=0;i<s.length();i++){
        set.add(s.charAt(i));
       }
       for(int i=0;i<t.length();i++){
        if(!set.contains(t.charAt(i))){
             System.out.println("false");
             return;
        }
        
       }
       System.out.println("true");
    }
}
