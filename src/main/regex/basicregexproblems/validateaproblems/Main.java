package regex.basicregexproblems.validateaproblems;

public class Main {
    public static void main(String[] args) {
        String word = "tina_810";
        Username user = new Username();
        if(user.validUsername(word)){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Invalid Username");
        }
    }
}
