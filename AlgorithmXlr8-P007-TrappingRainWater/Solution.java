

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        int[] height = new int[n];
        for (int i = 0; i < n; i++) height[i] = sc.nextInt();
        int [] leftmax=new int[n];
        int [] rightmax=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
               rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
             if(height[i]<leftmax[i] && height[i]<rightmax[i]){
                total+=Math.min(leftmax[i],rightmax[i])-height[i];
             }
             
        }
        System.out.println(total);
        

}

    }

