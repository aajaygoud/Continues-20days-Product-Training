public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] arr= {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        for(int i =0;i<4-2;i++){
            for(int j=i+1;j<4;j++){

//                swapp(arr,i,j);
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;

            }

        }

        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
    public static void swapp(int[][] arr,int i,int j){

    }
}