package regex.advancedproblems.validatecreditcard;

import java.util.regex.Pattern;

public class ValidCreditCard {

        public static boolean validate(String credit){

            String regex="4[0-9]{15}";
            String regex2="5[0-9]{15}";

            Pattern pattern= Pattern.compile(regex);
            Pattern pattern2= Pattern.compile(regex2);

            return ((pattern2.matcher(credit).matches())||(pattern.matcher(credit).matches()));



        }

    }


