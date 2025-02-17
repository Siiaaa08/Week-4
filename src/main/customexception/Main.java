package customexception;

import java.util.Scanner;

import static customexception.InvalidAge.validAge;

public class Main {
        public static void main(String[] args) throws CustomException {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your Age :- ");
            int age=sc.nextInt();
            validAge(age);
        }
    }


