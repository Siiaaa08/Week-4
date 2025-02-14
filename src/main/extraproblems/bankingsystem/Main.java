package extraproblems.bankingsystem;

public class Main {
        public static void main(String[] args) {
            BankingSystem bank = new BankingSystem();

            bank.addAccount("ACC123", 5000.0);
            bank.addAccount("ACC456", 3000.0);
            bank.addAccount("ACC789", 7000.0);

            bank.requestWithdrawal("ACC123");
            bank.requestWithdrawal("ACC456");
            bank.processWithdrawals(2000.0);

            bank.displaySortedAccounts();
        }
    }


