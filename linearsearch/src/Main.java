import java.util.Scanner;


/*
LINEAR SEARCH

SPACE COMPLEXITY IS O(1)


 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=in.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target element: ");
        int target=in.nextInt();
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Element found  at index "+i);
                f=1;
                break;
            }


        }
        if(f==0)
            System.out.println("element not found");

    }
}