package mapinterfacetest.wordfrequencycountertest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static mapinterface.wordfrequencycounter.WordFrequency.frequency;

public class WordFrequencyTest {
        @Test
        public void Tester(){
            String input="Hello world, hello Java";
            Map<String,Integer> map= frequency(input);
            Assert.assertEquals(3,map.size());
        }
    }


