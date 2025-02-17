package regex.extractionproblems.extractcapitalizedword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWord {
    public void extractCapital(String word){
        String regex = "[A-Z]+[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        while(matcher.find()){
            System.out.println("Matched -> "+matcher.group());
        }
    }
}
