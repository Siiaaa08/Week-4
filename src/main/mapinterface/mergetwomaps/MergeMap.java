package mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {
        public static Map<String,Integer>  mergeMap(Map<String,Integer> map1,Map<String,Integer> map2){
            Map<String,Integer> mapResult=new HashMap<>();
            for(Map.Entry<String,Integer> item:map1.entrySet()){
                mapResult.put(item.getKey(),item.getValue());

            }
            for(Map.Entry<String,Integer> item:map2.entrySet()){
                mapResult.put(item.getKey(),mapResult.getOrDefault(item.getKey(), 0) + item.getValue());

            }
            return mapResult;
        }
    }


