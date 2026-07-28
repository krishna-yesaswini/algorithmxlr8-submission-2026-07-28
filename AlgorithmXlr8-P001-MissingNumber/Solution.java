import java.util.*;

public class Main {
    public static void main(String[] args) {
        int origin=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        int sum=n*(n+1)/2;
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextLong();
            origin+=nums[i];
        }
        
        System.out.println(sum-origin);
        
    }
}
