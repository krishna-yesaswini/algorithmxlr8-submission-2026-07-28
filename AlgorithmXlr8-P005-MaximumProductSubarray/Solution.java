import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        int maxproduct=Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++ ){
                product*=nums[j];
                maxproduct=Math.max(maxproduct,product);
            }
            
        }
        System.out.println(maxproduct);
    }
}