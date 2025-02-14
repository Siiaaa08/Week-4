package mapinterfacetest.invertmaptest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static mapinterface.invertmap.InvertMap.invertMap;

public class InvertMapTest {
        @Test
        public void Tester(){
            Map<String,Integer> input=new HashMap<>();
            input.put("A",1);
            input.put("B",2);
            input.put("C",1);
            Map<Integer, ArrayList<String>> result=invertMap(input);
            Assert.assertEquals(2,result.size());
        }

    }


