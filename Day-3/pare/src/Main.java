import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        double ans=6|3&9+6;
//        System.out.println(ans);
//        System.out.println(~9+4&6);
//        System.out.println(~9);
        System.out.println(4^1);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no: ");
        int no=in.nextInt();
        isodd(no);



    }
    public static void isodd(int no){
        if((no&1)==1){
            System.out.println("odd");
        }
        else
            System.out.println("even");
    }
}