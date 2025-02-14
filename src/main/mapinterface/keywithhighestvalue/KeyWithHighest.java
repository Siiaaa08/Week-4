package mapinterface.keywithhighestvalue;

import java.util.Map;

public class KeyWithHighest {
        public static String maxKey(Map<String,Integer> input){
            int max=Integer.MIN_VALUE;
            String Key="";
            for(Map.Entry<String,Integer> item:input.entrySet()){
                if(max<item.getValue()){
                    max= item.getValue();
                    Key=item.getKey();
                }
            }
            System.out.println(Key);
            return Key;
        }
    }


