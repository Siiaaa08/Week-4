package finallyblocktest;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

import static finallyblock.IntegerDivision.division;

public class IntegerDivisionTest {

        @Test
        public void Tesster(){
            int ans=0;
            try{
                int a=4;
                int b=2;
                ans=division(a,b);


            }catch (InputMismatchException e){
                System.out.println("Please enter integer");
            }
            Assert.assertEquals(2,ans);
        }
    }


