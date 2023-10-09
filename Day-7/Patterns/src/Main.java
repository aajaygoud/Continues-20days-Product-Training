import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter choice: \n1.pattern1\n2.pattern2\n3.pattern3\n4.pattern4\n5.pattern5\n6.pattern6");
        System.out.println("7.pattern7(pyramid)\n8.pattern8(DIAMOND)\n");
        int ch=in.nextInt();
        System.out.println("Enter no of rows: ");
        int no=in.nextInt();
        switch(ch){
            case 1:pattern1(no);break;
            case 2:pattern2(no);break;
            case 3:pattern3(no);break;
            case 4:pattern4(no);break;
            case 5:pattern5(no);break;
            case 6:pattern6(no);break;
            case 7:pattern7(no);break;
            case 8:pattern8(no);break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void pattern1(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int r){
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int r){
        //ADDING PATTERN 2 AND PATTERN 3
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static void pattern6(int r){
        //same as 3 rd pattern;
//        for(int i=1;i<2*r;i++){
//            if(i<=r){
//                for(int j=1;j<=i;j++){
//                    System.out.print("* ");
//                }
//
//            }
//            else{
//                for(int j=1;j<=2*r-i;j++){
//                    System.out.print("* ");
//
//                }
//
//            }
//            System.out.println();
//        }
        for(int i=1;i<2*r;i++){
            int con=i>r?2*r-i:i;
            for(int j=1;j<=con;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int r){
        for(int i=1;i<=r;i++){
            int spaces=r-i;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=1;i<2*n;i++){
           int space=i<=n?n-i:i-n;
           for(int s=1;s<=space;s++){
               System.out.print(" ");
           }
           int star=i<=n?(2*i-1):(2*n-1)-((i-n)+(i-n));
           for(int j=1;j<=star;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }

}