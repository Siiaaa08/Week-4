package regex.advancedproblems.extractprogramminglanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
        public static void extractLang(String txt){

            String regex="(Java|JavaScript|Python|Go)";
            Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            Matcher matcher=pattern.matcher(txt);
            while(matcher.find()){
                System.out.print(matcher.group()+", ");
            }


        }
    }


