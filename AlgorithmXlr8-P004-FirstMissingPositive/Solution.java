import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            set.add(nums[i]);
        }

        int candidate = 1;

        while (set.contains(candidate)) {
            candidate++;
        }

        System.out.println(candidate);
    }
}