import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.next();
        String needle = sc.next();

        int i = 0;

        while (i <= haystack.length() - needle.length()) {

            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                System.out.println(i);
                return;
            }

            i++;
        }

        System.out.println(-1);
    }
}