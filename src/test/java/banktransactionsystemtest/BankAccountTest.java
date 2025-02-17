package banktransactionsystemtest;

import banktransactionsystem.BankAccountSystem;
import banktransactionsystem.InsufficientBalanceException;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
        @Test
        public void Tester() throws InsufficientBalanceException {
            BankAccountSystem customer1;
            double amount=2000;
            if(amount>0){
                customer1=new BankAccountSystem("Deepak","Acc0137913",amount);
                double withdraw=1500;
                customer1.withdrawl(withdraw);
            }
            else{
                throw new IllegalArgumentException("Invalid amount!");
            }
            double current =customer1.getAmount();
            Assert.assertEquals(500,current,0.01);

        }
    }


