import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter order of matrix you want: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       //int n=5;
        int[][] mat=new int[n][n];
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                System.out.print(mat[k][l]+" ");
            }
            System.out.println();
        }
        int num=1;
        int i=n/2;
        int j=n-1;
        while (num<=n*n){

            if(i<0 && j>=n){
                i=0;
                j=n-2;
            }
            if(j>=n){
                j=0;
            }
            if(i<0){
                i=n-1;
            }
            if(mat[i][j]!=0){
                i++;
                j-=2;
            }

           mat[i][j]=num++;
           i--;
           j++;



        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                System.out.print(" "+mat[k][l]+" ");
            }
            System.out.println();
        }
    }
}