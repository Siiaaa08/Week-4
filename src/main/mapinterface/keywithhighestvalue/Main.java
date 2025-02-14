package mapinterface.keywithhighestvalue;

import java.util.HashMap;
import java.util.Map;

import static mapinterface.keywithhighestvalue.KeyWithHighest.maxKey;

public class Main {
        public static void main(String[] args) {
            Map<String,Integer> input=new HashMap<>();
            input.put("A",10);
            input.put("B",40);
            input.put("C",20);
            maxKey(input);
        }
    }


