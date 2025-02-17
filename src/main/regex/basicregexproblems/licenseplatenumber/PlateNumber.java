package regex.basicregexproblems.licenseplatenumber;

import java.util.regex.Pattern;

public class PlateNumber {
    public boolean isValid(String text){
        String regex = "\\D{2}\\d{4}";
        return Pattern.matches(regex,text);
    }
}
