package mapinterfacetest.keywithhighestvaluetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static mapinterface.keywithhighestvalue.KeyWithHighest.maxKey;

public class KeyWithHighestTest {
        @Test
        public void Tester(){
            Map<String,Integer> input=new HashMap<>();
            input.put("A",10);
            input.put("B",40);
            input.put("C",20);
            String ans=maxKey(input);
            Assert.assertEquals("B",ans);
        }
    }


