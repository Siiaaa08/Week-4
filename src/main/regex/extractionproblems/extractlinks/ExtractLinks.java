package regex.extractionproblems.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public void extractLink(String text){
        String regex = "https?://(www)?([a-zA-Z0-9.]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("Links -> "+matcher.group());
        }
    }
}
