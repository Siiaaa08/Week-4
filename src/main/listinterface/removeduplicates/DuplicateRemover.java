package listinterface.removeduplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

public class DuplicateRemover<T>{
    public List<T> removeDuplicates(List<T> list){
        Set<T> uniqueElements = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueElements);
    }
}
