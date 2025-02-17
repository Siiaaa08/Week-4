package regex.extractionproblems.extractemailaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    public void extractEmail(String text){
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Matched:"+matcher.group());
        }
    }
}
