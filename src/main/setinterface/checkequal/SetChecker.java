package setinterface.checkequal;

import java.util.Set;

public class SetChecker<T> {
    public  boolean areSetsEqual(Set<T> set1, Set<T>set2){
        return set1.equals(set2);
    }
}
