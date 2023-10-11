import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr={1,2,8,10,10,12,19};
        int t=7;
        int ans=binarySearch(arr,t);
        System.out.println(Arrays.toString(arr));
        System.out.println("Ceil value is: ");
        System.out.println(arr[ans]);
        int ans1=floorSearch(arr,t);
        System.out.println("Floor value is: ");
        System.out.println(arr[ans1]);
    }
    public static int binarySearch(int[] arr,int t){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
             mid=(low+high)/2;
             if(arr[mid]==t){
                 return mid;
             }
             else if(arr[mid]>t){
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }
        }

        return low;
    }
    public static int floorSearch(int[] arr,int t){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return high;
    }
}