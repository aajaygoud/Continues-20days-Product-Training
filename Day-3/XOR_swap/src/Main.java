import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        xor(in.nextInt(),in.nextInt());
    }
    public static void xor(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping");
        System.out.println(a +" " +b);
    }
}