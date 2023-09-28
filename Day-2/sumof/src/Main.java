import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int inp=in.nextInt();
        int s=0;
        //USING WHILE LOOP
        while(inp>0){
            s=s+inp%10;
            inp=inp/10;

        }
        System.out.println("The sum is: "+s);
        System.out.println("Enter number: ");
        //USING FOR LOOP

        forsum(in.nextInt());
    }
    public static void forsum(int inp){
        int s=0;
        //int l=(int)((Math.log10(inp)))+1;
        for(;inp>0;inp/=10){
            s=s+inp%10;

        }
        System.out.println("Sum is: "+s);
    }
}