import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={3,1,-2,-5,2,-4};
        int n=arr.length;
        int[] even=new int[n/2];
        int[] odd=new int[n/2];
        int k=0;
        int k1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                even[k++]=arr[i];
            }
            else{
                odd[k1++]=arr[i];
            }
        }
        int i=0;
        int j=0;
        int k3=0;
        while(i< even.length || j< odd.length){
            arr[k3++]=even[i++];
            arr[k3++]=odd[j++];

        }
        System.out.println(Arrays.toString(arr));
    }
}