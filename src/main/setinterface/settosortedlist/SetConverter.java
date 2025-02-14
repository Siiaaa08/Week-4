package setinterface.settosortedlist;

import java.util.*;

public class SetConverter {
    public static List<Integer> convertToSortedList(Set<Integer> set){
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
}
