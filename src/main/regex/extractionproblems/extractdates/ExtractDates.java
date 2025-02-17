package regex.extractionproblems.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public void extractDate(String text){
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Dates -> "+matcher.group());
        }
    }
}
