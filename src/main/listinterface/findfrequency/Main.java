package listinterface.findfrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple","Banana","apple","orange"));
        FrequencyCalculator calculator = new FrequencyCalculator();
        Map<String,Integer> result = calculator.countFrequency(words);
        System.out.println("Frequency Count:"+result);
    }
}
