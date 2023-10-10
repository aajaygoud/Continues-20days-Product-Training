import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter array size: ");

        int no=in.nextInt();
        int[][] arr=new int[no][];
        int[][] ne=new int[no][];
        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Rotation of matrix: ");
        int k=0;
        for(int i=no-1;i>=0;i--){
            k++;
            for(int j=0;j<no;j++){
                ne[k][j]=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(ne));
    }
}