package regex.basicregexproblems.licenseplatenumber;

public class Main {
    public static void main(String[] args) {
        String text = "SS0708";
        PlateNumber number = new PlateNumber();
        if(number.isValid(text)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
