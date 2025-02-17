package regex.replaceandmodifystrings.replacemultiplespaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {
    public void replaceSpaces(String text){
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Found Space:"+matcher.group()+" '");
        }
        String replaced = text.replaceAll(regex," ");
        System.out.println("Replaced String:"+replaced);
    }
}
