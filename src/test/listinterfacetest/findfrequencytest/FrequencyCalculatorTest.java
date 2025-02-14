package listinterfacetest.findfrequencytest;

import listinterface.findfrequency.FrequencyCalculator;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class FrequencyCalculatorTest {
    @Test
    public void tester(){
        FrequencyCalculator calculator = new FrequencyCalculator();
        List<String> input = new ArrayList<>(Arrays.asList("Banana","apple","orange","apple"));
        Map<String,Integer> output1 = new HashMap<>();
        output1.put("Banana",1);
        output1.put("apple",2);
        output1.put("orange",1);

        Map<String,Integer> output2 = calculator.countFrequency(input);
        assertEquals(output1,output2);
     }
}
