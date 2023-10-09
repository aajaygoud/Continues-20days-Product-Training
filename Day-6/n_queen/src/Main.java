public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] nums = new int[4][4];
        int i = 0;
        int j = 1;
        int num = 1;
        while(num<=4){
            if(j>3){
                j=0;
            }
            nums[i][j]='Q';
            num++;
            i+=1;
            j+=2;

        }
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
                System.out.print((char)nums[r][c]+" ");
            }
            System.out.println();
        }


//        int i = 0;
//        int j = 2;
//        int num = 1;
//        int[] ar=new int[4];
//        while(num<=4){
//            ar[i]=j;
//            for(int c=0;c<ar.length;c++){
//                if(ar[c]==j){
//                    j++;
//                }
//            }
//            if(j>=3){
//
//                j=0;
//            }
//            nums[i][j]=1;
//            num++;
//            i+=1;
//            j+=2;
//
//        }
//        for(int r=0;r<4;r++){
//            for(int cr=0;cr<4;cr++){
//                System.out.print(nums[r][cr]+" ");
//            }
//            System.out.println();
//        }
    }
}