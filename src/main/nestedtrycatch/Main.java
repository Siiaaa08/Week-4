package nestedtrycatch;
import java.util.*;
import static nestedtrycatch.OperationsArray.checkArray;

public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] arr= new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=i+1;

            }
            System.out.print("Enter the Index :- ");
            int index=sc.nextInt();
            System.out.print("\nEnter the number for division :- ");
            int no=sc.nextInt();
            int number=checkArray(arr,index);


            try{
                int j=number/no;
                System.out.println("The result :- "+j);
            }catch (ArithmeticException e){
                System.out.println("Please enter number greater than zero");

            }

        }
    }


