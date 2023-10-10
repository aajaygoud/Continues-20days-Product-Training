import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        int [] arr={6,8,9,5,4,3,26,2};
        System.out.println("Enter your equal sum k value: ");
        //int t=in.nextInt();

        boolean ans=subSet(arr, arr.length, 40);
        System.out.println(ans);
    }
    public static boolean subSet(int[] arr,int n,int sum){
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(arr[n-1]>sum){
            return subSet(arr,n-1,sum);
        }
        return subSet(arr,n-1,sum) || subSet(arr,n-1,sum-arr[n-1]);
    }
}