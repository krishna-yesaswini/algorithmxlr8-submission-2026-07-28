import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int maxvalue = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {
                maxvalue = Math.max(maxvalue, nums[j]);
            }

            result[i] = maxvalue;
        }

        // Print the result array
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}