import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       Scanner in=new Scanner(System.in);
        System.out.println("Enter your choice:\n1.Bubble\n2.Insertion\n3.Selection\n4.QuickSort\n5.Merge_sort");
        int ch=in.nextInt();
        //int[] arr={14,8,2,19,69,1};
        int[] arr={1,3,2,1,3,0,5,1};
        switch(ch){
            case 1:bubble(arr);break;
            case 2:insertion(arr);break;
            case 3:selectionSort(arr);break;
           // case 4:quickSort(arr,0,arr.length-1);
            case 5:mergeSort(arr,0,arr.length-1);
                     break;
            default:
                System.out.println("Enter valid choice: ");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){

        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    c=1;
                }
            }
            if(c==0){
                break;
            }

        }

    }
    public static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void insertion(int[] arr){
        for(int i=0;i< arr.length;i++){
            int c=arr[i];
            int j=i-1;
            while(j>=0 && c<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=c;

        }


    }
    public static void selectionSort(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            int m=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[m]){
//                    m=j;
//                }
//            }
//            if(m!=i){
//                swap(arr,i,m);
//            }
//        }


        //2   ND APPROACH
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    swap(arr, i, j);
                    c = 1;
                }
            }
            if(c==0){
                break;
            }
        }

    }
    public static void mergeSort(int[] arr,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            int[] n=new int[arr.length];
           merge(arr,i,mid,j,n,0);

        }


    }

    public static void merge(int[] arr,int i,int mid,int j,int[] n,int k){
        int tot=mid+1;
        while(i<=mid && tot<=j){
            if(arr[i]<arr[tot]){
                n[k]=arr[i];
                i++;

            }
            else{
                n[k]=arr[tot];
                tot++;
            }
            k++;
        }
        if(i<=mid){
            n[k]=arr[i];
        }
        if(tot<=j){
            n[k]=arr[tot];
        }
        for(int h=0;h<n.length;h++){
            arr[h]=n[h];
        }



    }


}