import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},
                     {4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //  logic for transpose
        int[][] tr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tr[j][i]=arr[i][j];

            }
        }
        System.out.println("After Transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
        //LOGIC FOE ROTATION OF MATRIX
        int[][] ro=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ro[i][j]=tr[i][j];

            }
        }
        for(int i=0;i<3;i++){
            ro[i][2]=tr[i][0];

        }
        for(int i=0;i<3;i++){
            ro[i][0]=tr[i][2];

        }
        System.out.println("After rotation");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ro[i][j]+" ");
            }
            System.out.println();
        }


    }
}