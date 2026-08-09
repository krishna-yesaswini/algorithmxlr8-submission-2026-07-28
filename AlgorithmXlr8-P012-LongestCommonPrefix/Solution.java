import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < n; i++) strs[i] = sc.next();
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
               if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) break;
               result.append(strs[0].charAt(i));
        }
        System.out.println(result);

        

    }
}
