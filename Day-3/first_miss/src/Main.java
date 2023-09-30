import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={3,1,-5,-6,0,4};
        int i=0;
        while(i<arr.length){
            int c=arr[i];
            if(arr[i]<=arr.length && arr[i]!=arr[c]){
                swap(arr,i,c);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}