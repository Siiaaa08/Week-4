package regex.basicregexproblems.validateaproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
    public boolean validUsername(String word){
        String regex = "^[a-zA-Z0-9_.+]{5,15}";
       return Pattern.matches(regex,word);
    }
}
