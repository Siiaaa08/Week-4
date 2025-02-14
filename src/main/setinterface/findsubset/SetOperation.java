package setinterface.findsubset;

import java.util.Set;

public class SetOperation {
    public static <T> boolean isSubset(Set<T> subset, Set<T> mainSet){
        return mainSet.containsAll(subset);
    }
}
