package setinterfacetest.symmetricdifferencetest;

import org.junit.Test;
import setinterface.symmetricdifference.SetOperation;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetOperationTest {
    @Test
    public void test(){
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,4,5);
        Set<Integer> output = Set.of(1,2,4,5);
        assertEquals(output, SetOperation.symmetricDifference(set1,set2));
    }
}
