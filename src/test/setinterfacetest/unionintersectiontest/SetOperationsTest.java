package setinterfacetest.unionintersectiontest;

import org.junit.Test;
import setinterface.unionintersection.SetOperations;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetOperationsTest {
    @Test
    public void test(){
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,4,5);

        Set<Integer> union = Set.of(1,2,3,4,5);
        Set<Integer> intersection = Set.of(3);
        assertEquals(union,SetOperations.union(set1,set2));
        assertEquals(intersection,SetOperations.intersection(set1,set2));
    }
}
