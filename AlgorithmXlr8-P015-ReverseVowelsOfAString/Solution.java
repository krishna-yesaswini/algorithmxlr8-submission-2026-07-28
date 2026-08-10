import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                 arr[i] == 'o' || arr[i] == 'u') &&
                (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' ||
                 arr[j] == 'o' || arr[j] == 'u')) {

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
            else if (!(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                       arr[i] == 'o' || arr[i] == 'u')) {
                i++;
            }
            else {
                j--;
            }
        }

        System.out.println(new String(arr));
    }
}