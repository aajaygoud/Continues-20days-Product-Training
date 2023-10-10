import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //int[] arr={1,3,2,1,3,0,5,1};
        int[] arr={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        //int[] arr={1,10,2};
        int maxx=maxi(arr);
        int[] freq=new int[maxx+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println("Given array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Count array: ");
        System.out.println(Arrays.toString(freq));
        System.out.println("Update freq array with adding prefix: ");
        for(int i=1;i< freq.length;i++){
            freq[i]=freq[i-1]+freq[i];
        }
        System.out.println(Arrays.toString(freq));
        int[] arr2=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int k=--freq[arr[i]];
            arr2[k]=arr[i];
        }
        System.out.println("Final array : ");
        System.out.println(Arrays.toString(arr2));
    }
    public static int maxi(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}