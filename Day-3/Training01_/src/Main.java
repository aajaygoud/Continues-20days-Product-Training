import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int amount=100000;

        double interest=((amount*(5/12)*12)/1000);

        System.out.println("Amount to be withdraw: ");
        int with=in.nextInt();
        double bal=interest-with;
        bal=((bal*(9/12)*12)/100);
        int deposited=10000;
        bal=bal-deposited;


        System.out.print(bal);
        System.out.println("enter choice:"\n"");


    }
}