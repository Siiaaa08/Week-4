package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);

        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        result.removeAll(intersection);
        return result;

    }
}
