
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        checkWithCurr(arr); //Sorting O(n) time complexity
        int ans=missing(arr);

        System.out.println(ans);

    }
    static void checkWithCurr(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]>=arr.length)
            {
                i++;
            }
            else if(arr[i]<0){
                i++;
            }
            else if(arr[i]==arr[correct])
            {
                i++;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }

    }
    static int missing(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }

        }
        return arr.length;
    }
}