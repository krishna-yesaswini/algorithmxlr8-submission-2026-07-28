import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int[] nums = new int[n];
        int max=nums[0];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                count+=1;
            }
        }
        System.out.println(count);
           
       
    }
}
