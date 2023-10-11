public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] e=new int[]{2,4,6,8};
        int[] o=new int[]{1,3,5,7,9};
        int k=0;
        int k1=o.length-1;

        int[][] arr=new int[4][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1 && j==1){
                    arr[i][j]=o[k1--];
                }
               else  if(((i+j)%2)==0){



                        int ans = e[k++];
                        arr[i][j] = ans;

                }
                else if(((i+j)%2)!=0){
                    arr[i][j]=o[k1--];

                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}