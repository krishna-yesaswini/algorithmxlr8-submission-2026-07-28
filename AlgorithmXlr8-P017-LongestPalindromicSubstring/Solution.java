import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String lps="";
        if(s.length()<=1){
            System.out.println(s);
            return;
        }
        for(int i=0;i<s.length();i++){
            int low=i;
            int high=i;
        

            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            
           
            }
            String palindrome =s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps=palindrome;
            }
             low=i-1;
             high=i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            
            
            }
              palindrome =s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps=palindrome;
            }
        }
            System.out.println(lps);




        


       
    }
}
