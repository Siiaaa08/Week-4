package throwvsthrows;

public class CalculateInterest {
        public static double calculate(double amount, double rate, int years){
            if(amount<0||rate<0){
                throw new IllegalArgumentException("Enter valid amount and rate");
            }
            return (amount*rate*years*0.01);
        }
    }


