import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={3,9,8,6,-1,-3,5,2,11};
        int r=4;
        int k=r% arr.length;
        int n=arr.length;
        rev(arr,0, arr.length-k-1);
        rev(arr,n-k,arr.length-1);
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int start,int end){
        while(start<end){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }
}