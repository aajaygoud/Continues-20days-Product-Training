public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr={1,2,3,4,5,6,7,8};
        int t=7;
        int f=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                System.out.println("Element found at index: "+i);
                f=1;
                break;
            }
            else if(arr[j]==t){
                System.out.println("Element found at index: "+j);
                f=1;
                break;
            }
            else{
                j--;
            }
        }
        if(f==0){
            System.out.println("Element not found");
        }


        //binarySearchh(arr,t);


        int ans=recbinaryse(arr,0,arr.length-1,t);
        if(ans==-1){
            System.out.println("Element not found: ");
        }
        else{
            System.out.println("element is found at index "+ans);
        }
    }
    public static void binarySearchh(int[] arr,int t){
        int i=0;
        int j= arr.length-1;
        int f=0;
        while (i<j){
            int mid=(i+j)/2;
            if(t==arr[mid]){
                System.out.println("Element found at index: "+mid);
                f=1;
                break;
            }
            else if(t>arr[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        if(f==0){
            System.out.println("Element not found: ");
        }
    }
    public static int recbinaryse(int[] arr,int i,int j,int t){
        if(i<j){
            int mid=(i+j)/2;
            if(t==arr[mid]){
                return mid;
            }
            else if(t>arr[mid]){
                recbinaryse(arr,mid+1,j,t);
            }
            else{
                recbinaryse(arr,i,mid-1,t);
            }

        }
        System.out.println("ajay");
        return -1;
    }
}