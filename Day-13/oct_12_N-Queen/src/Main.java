import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n=4;
        int[][] arr=new int[n][n];
        System.out.println(Arrays.deepToString(arr));
        int[] n_arr=new int[n];
        int k=0;
        int i=0;
        int j=(n/2)-1;
        while(i<n){
            for(int ind=0;ind<n;ind++){
                if(n_arr[ind]==j){
                    j+=1;
                }
            }
            if(j>=n){
                j=0;
            }
            arr[i][j]=1;
            n_arr[k++]=j;
            i+=1;
            j+=2;
        }
        System.out.println("After Queen is placed: ");
        for(int ii=0;ii<n;ii++){
            for(int kk=0;kk<n;kk++){
                System.out.print(arr[ii][kk]+" ");
            }
            System.out.println();
        }
    }
}