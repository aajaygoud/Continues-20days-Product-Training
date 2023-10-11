public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] mat={{6,1,8},
                     {3,5,7},
                     {,9,}};
        int f=0;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=mat[i][j];
            }
            if(sum!=15){
                System.out.println("NOT a magical matrix sorry");
                f=1;
                break;

            }
        }
        if(f==0){
            System.out.println("YEs it is magical matrix");
        }
    }
}