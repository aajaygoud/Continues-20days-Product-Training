import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Starting value: ");
        int start=in.nextInt();
        System.out.println("Enter ending Value: ");
        int end=in.nextInt();
        int[] arr=new int[end-start];
        System.out.println("arr length"+arr.length);
        int k=0;
        for(int i=start;i<end;i++){
            System.out.println("Enter number less than "+end+" greater than "+start);
            int num= in.nextInt();
            if(num<end && num>start){
                arr[k++]=num;

            }
        }
        System.out.println("Array is");
        System.out.println(Arrays.toString(arr));
        even(arr);
        powerof(arr,end);
    }
    public static void even(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even "+arr[i]);
            }
        }

    }
    public static void powerof(int[] arr,int end){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                double a=arr[j];
                if((Math.pow(2,a)).equals(arr[i])){
                    System.out.println("power is: "+arr[i]);
                }
            }
        }
    }
}