package listinterface.findfrequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCalculator {
    public Map<String,Integer> countFrequency(List<String> list){
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String item : list){
            frequencyMap.put(item,frequencyMap.getOrDefault(item,0)+1);
        }
        return frequencyMap;
    }
}
