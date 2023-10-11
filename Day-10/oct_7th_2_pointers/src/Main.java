import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={2,3,5,7,10,12,15,20};
        int t=19;
        int[] ne=twoPointer(arr,t);
        System.out.println(Arrays.toString(ne));
    }
    public static int[] twoPointer(int[] arr,int t){
        int j=arr.length-1;
        int i=0;
        while(i<j){
            if(arr[i]+arr[j]==t){
//                System.out.println((i+1)+" "+(j+1));//POSITIONS NOT INDEX
//                break;
                return new int[]{i+1,j+1};

            }
            else if(arr[i]+arr[j]>t){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}