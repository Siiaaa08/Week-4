package mapinterfacetest.mergetwomapstest;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static mapinterface.mergetwomaps.MergeMap.mergeMap;

public class MergeMapTest {


        @Test
        public void Tester(){
            Map<String,Integer> map1=new HashMap<>();
            map1.put("A",1);
            map1.put("B",2);
            map1.put("C",1);

            Map<String,Integer> map2=new HashMap<>();
            map2.put("A",1);
            map2.put("D",2);
            Map<String,Integer> result=mergeMap(map1,map2);
            Assert.assertEquals(4,result.size());

        }
    }




