package setinterface.checkequal;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetChecker<Integer> checker = new SetChecker<>();
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,2,1);
        System.out.println("Set1 is equal to set2 -> "+checker.areSetsEqual(set1,set2));
    }
}
