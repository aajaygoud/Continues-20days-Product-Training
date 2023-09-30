import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            c^=arr[i];

        }
        System.out.println("Missing element is: "+c);

    }


}