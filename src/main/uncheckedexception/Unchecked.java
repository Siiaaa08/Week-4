package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked {
    public void readFile(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value:");
            int a = sc.nextInt();
            System.out.println("Enter the second value:");
            int b = sc.nextInt();
            System.out.println("Divison:");
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception"+e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Entered the wrong value");
        }
    }
}
