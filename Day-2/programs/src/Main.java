import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        while(true) {
            System.out.println();
        System.out.println("Enter choice:\n1.sum of digits\n2.Fibonacci\n3.Factorial");
        Scanner in=new Scanner(System.in);
            int ch = in.nextInt();
            if (ch == 1) {
                System.out.println("Enter no: ");
                int no = in.nextInt();
                int ans = sum(no);
                System.out.println("The sum is: "+ans);
            } else if (ch == 2) {
                System.out.println("Enter no: ");
                int no = in.nextInt();
                int ans = fibo(no);
                System.out.println("The fibbonacci is "+ans);
            } else if (ch == 3) {
                System.out.println("Enter no: ");
                int no = in.nextInt();
                int ans = fact(no);
                System.out.println("Factorial is "+ans);
            } else {
                System.out.println("Enter valid choice");
            }
        }
    }
    public static int sum(int n) {
        if (n <0)
            return 0;
        else
            return n + sum(n - 1);
    }
    public static int fibo(int n){
        if(n<2)
            return n;
        else
            return fibo(n-1)+fibo(n-2);

    }
    public static int fact(int n){
        if(n<1)
            return 1;
        else return n*fact(n-1);
    }

}