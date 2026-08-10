import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int total=0;
        int largestseensofar=0;
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1); map.put('V',5); map.put('X',10); map.put('L',50); map.put('C',100); map.put('D',500); map.put('M',1000);
        for(int i=s.length()-1;i>=0;i--){
            int value=map.get(s.charAt(i));
            if(value<largestseensofar){
                total-=value;
            }
            else{
                total+=value;
                largestseensofar=value;
            }
        }
        System.out.println(total);

    }
}
