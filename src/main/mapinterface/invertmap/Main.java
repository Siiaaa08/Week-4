package mapinterface.invertmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static mapinterface.invertmap.InvertMap.invertMap;

public class Main {
        public static void main(String[] args) {
            Map<String,Integer> input=new HashMap<>();
            input.put("A",1);
            input.put("B",2);
            input.put("C",1);
            Map<Integer, ArrayList<String>> result=invertMap(input);
            for(Map.Entry<Integer, ArrayList<String>> item:result.entrySet()){
                System.out.println(item.getKey()+" :- "+item.getValue());
            }
        }
    }


