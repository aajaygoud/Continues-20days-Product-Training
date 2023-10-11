import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=3;
        int ans=(1<<(k-1));
        System.out.println(ans);
        int a=ans ^ n;
        System.out.println(a);

    }
}