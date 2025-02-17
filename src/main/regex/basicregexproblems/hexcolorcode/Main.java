package regex.basicregexproblems.hexcolorcode;

public class Main {
    public static void main(String[] args) {
        String code = "#SAL908";
        ColorCode cc = new ColorCode();
        if(cc.isValid(code)){
            System.out.println("Is Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
