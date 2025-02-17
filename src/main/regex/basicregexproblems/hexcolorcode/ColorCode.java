package regex.basicregexproblems.hexcolorcode;

import java.util.regex.Pattern;

public class ColorCode {
    public boolean isValid(String code){
        String regex = "#[a-zA-Z0-9]{6}";
        return Pattern.matches(regex,code);

    }
}
