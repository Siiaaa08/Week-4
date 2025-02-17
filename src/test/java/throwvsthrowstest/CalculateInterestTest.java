package throwvsthrowstest;

import org.junit.Assert;
import org.junit.Test;

import static throwvsthrows.CalculateInterest.calculate;

public class CalculateInterestTest {

        @Test
        public void Tester(){
            double interest = calculate(1000, 5, 2);
            Assert.assertEquals(100.0,interest,0.01);
        }
    }


