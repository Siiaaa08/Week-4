package setinterface.findsubset;



import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,4,6,8);
        Set<Integer> set2 = Set.of(4,6);
        boolean result = SetOperation.isSubset(set2,set1);
        System.out.println(result);
    }
}
