package setinterface.symmetricdifference;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3,4,5);
        Set<Integer> set2 = Set.of(3,4,5,6,7);

        System.out.println("Set1 -> "+set1);
        System.out.println("Set2 ->"+set2);
        System.out.println("Symmetric Difference -> "+SetOperation.symmetricDifference(set1,set2));
    }
}
