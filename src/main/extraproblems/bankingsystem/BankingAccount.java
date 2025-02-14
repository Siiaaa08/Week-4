package extraproblems.bankingsystem;

public class BankingAccount {
        private String accountNumber;
        private double balance;

        public BankingAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Account: " + accountNumber + ", Balance: $" + balance;
        }
    }


