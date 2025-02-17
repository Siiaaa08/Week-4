package regex.advancedproblems.validatecreditcard;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            String credit;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter credit card number: ");
            credit=sc.nextLine();
            if(ValidCreditCard.validate(credit)){
                System.out.println("Credit card is valid!!");
            }
            else{
                System.out.println("Credit is not valid! Calling cops!");
            }
        }
    }


