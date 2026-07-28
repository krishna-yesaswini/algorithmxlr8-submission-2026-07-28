import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prices = new long[n];
    
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();

        }
        long min_price=Long.MAX_VALUE;
        long max_profit=0;

        for(int i=0;i<n;i++){
           min_price=Math.min(min_price,prices[i]);
           long profittoday=prices[i]-min_price;
            max_profit=Math.max(max_profit,profittoday);
           
        }
        System.out.println(max_profit);
       


        
    }
}
