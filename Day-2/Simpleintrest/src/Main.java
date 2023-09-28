import java.util.Scanner;

//TO FIND SIMPLE INTEREST OF A CUSTOMER
public class Main {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter total money that available in bank: ");
//        int money=in.nextInt();
//        System.out.println("rate of interest: ");
//        int r=in.nextInt();
//        System.out.println("Enter Money to Withdraw");
//        int with_draw=in.nextInt();
//        int month=4;
//        int bal=(money*r*month)/100;
//        System.out.println(bal);

                double principal = 100000; // Initial balance in the bank account
                double annualInterestRate = 0.12; // Annual interest rate (12%)

                // Calculate monthly interest rate
                double monthlyInterestRate = annualInterestRate / 12;

                // Calculate the balance after 5 months
                for (int month = 1; month <= 5; month++) {
                    principal -= 25000; // Withdraw 25,000 rupees in the 5th month
                    principal += (principal * monthlyInterestRate); // Add interest
                }

                // Deposit 10,000 rupees in the 9th month
                principal += 10000;

                // Calculate the balance at the end of the financial year (12 months)
                for (int month = 10; month <= 12; month++) {
                    principal += (principal * monthlyInterestRate); // Add interest
                }

                // Print the final balance
                System.out.println("Ajay's balance at the end of the financial year: " + principal + " rupees");
            }
        }



