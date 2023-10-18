import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={3,2,4};
        int[] ans=summ(arr,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] summ(int[] nums,int target){
        int n=nums.length-1;
        int i=0;
        int j=n;
        sort(nums);
        while(i<=j){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            else if((nums[i]+nums[j])<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};

    }
}