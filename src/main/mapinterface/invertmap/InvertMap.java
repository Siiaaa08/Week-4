package mapinterface.invertmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvertMap {
        public static Map<Integer, ArrayList<String>> invertMap(Map<String,Integer> input){
            Map<Integer, ArrayList<String>> result=new HashMap<>();
            for(Map.Entry<String ,Integer> item:input.entrySet()){
                if(result.containsKey(item.getValue())){
                    result.get(item.getValue()).add(item.getKey());
                }
                else{
                    ArrayList<String> list=new ArrayList<>();
                    list.add(item.getKey());
                    result.put(item.getValue(),list);
                }
            }
            return result;
        }
    }


