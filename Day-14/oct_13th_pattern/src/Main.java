public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n=5;
//        for(int i=0;i<n;i++){
//            for(int s=0;s<n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        //PATTERN 2
//        for(int i=0;i<n;i++){
//            for(int s=0;s<n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){

            for(int j=0;j<2*n-1;j++)
            {
                if((i==n-1 || (i+j)==n-1) && i!=n-1)
                    System.out.print(1);

                if(j>n-1 && i!=0 && i!=n-1 ){
                    System.out.print(i+1);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
//        n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<2*n-1;j++){
//                if((i+j)==n-1){
//                    System.out.print(1);
//                }
//                if(j==n-1 && i!=0){
//                    System.out.print(i+1);
//                }
//                if(i==n-1 && j!=0){
//                    System.out.print(j+1);
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//        }

//
//        System.out.println("Pattern -2");
//        System.out.println();
//        n=10;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if((i==j)  || (i+j==n-1)){
//                    System.out.print(" ");
//                }
//                else{
//                    if(i==0 || i==n-1 || j==0 || j==n-1){
//                        System.out.print('*');
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//
//            }
//            System.out.println();
//        }
//
//        int ch=0;
//        int c=0;
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<=i;j++){
//                c=c%26;
//                ch=97+c;
//                c++;
//                System.out.print((char)ch);
//            }
//            System.out.println();
//        }
    }
}