package banktransactionsystem;

public class BankAccountSystem {
        private String accountNo,accountHolder;
        private double amount;
        public BankAccountSystem(String accountHolder, String accountNo, double amount){
            this.accountHolder=accountHolder;
            this.accountNo=accountNo;
            this.amount=amount;
        }

        public void withdrawl(double withdrwalAmount) throws InsufficientBalanceException {
            double j=amount-withdrwalAmount;
            this.amount=j;
            if(j>0){
                System.out.println("\nTransaction Sucessfull!");
                System.out.println("\nThe available Balance is "+amount);
            }else{
                throw new InsufficientBalanceException("Insufficient Balance!");
            }
        }
        public double getAmount(){
            return amount;
        }
    }


