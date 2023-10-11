import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        towerOf(n,'s','a','d');
        int ans=count(n);
        System.out.println("The total moves to move "+n+" disks to des is "+ans);
    }
    public static void towerOf(int n,char s,char a, char d){
        if(n<=1){
            System.out.println("move from "+s+" to dest "+d);
            return;
        }
        else{
            towerOf(n-1,s,d,a);
            System.out.println("move from "+s+" to dest "+d);
            towerOf(n-1,a,s,d);

        }

    }
    public static int count(int n){
        if(n==1){
            return 1;
        }
        else
            return 2*count(n-1)+1;
    }
}