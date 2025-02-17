package banktransactionsystem;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws InsufficientBalanceException {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Account Holder name :- ");
            String name=sc.nextLine();
            System.out.print("\nEnter the account number :- ");
            String account=sc.nextLine();

            System.out.print("\nEnter the amount :- ");
            double amount=sc.nextDouble();
            if(amount>0){
                BankAccountSystem customer1=new BankAccountSystem(name,account,amount);
                System.out.print("\nEnter the Withdrawl amount :- ");
                double withdraw=sc.nextDouble();
                customer1.withdrawl(withdraw);
            }
            else{
                throw new IllegalArgumentException("Invalid amount!");
            }


        }
    }


