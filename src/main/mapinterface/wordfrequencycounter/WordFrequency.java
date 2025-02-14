package mapinterface.wordfrequencycounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
        public static Map<String,Integer> frequency(String input){
            String[] words=input.split("\\s+");
            Map<String,Integer> countFreq=new HashMap<>();
            for(int i=0;i< words.length;i++){
                if(countFreq.containsKey(words[i].toLowerCase())){
                    countFreq.put(words[i].toLowerCase(),countFreq.get(words[i].toLowerCase())+1);
                }
                else{
                    countFreq.put(words[i].toLowerCase(),1);

                }
            }
            for(Map.Entry<String,Integer> entry: countFreq.entrySet()){
                System.out.println(entry.getKey()+" :- "+entry.getValue());
            }
            return countFreq;
        }
    }


