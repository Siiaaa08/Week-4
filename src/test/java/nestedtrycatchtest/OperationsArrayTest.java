package nestedtrycatchtest;

import org.junit.Assert;
import org.junit.Test;

import static nestedtrycatch.OperationsArray.checkArray;

public class OperationsArrayTest {
        @Test
        public void Tester(){
            int[] arr= new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=i+1;

            }
            int index=3;
            int no=2;
            int number=checkArray(arr,index);

            int ans = 0;
            try{
                ans=number/no;
                System.out.println("The result :- "+ans);
            }catch (ArithmeticException e){
                System.out.println("Please enter number greater than zero");

            }
            Assert.assertEquals(2,ans);
        }
    }



