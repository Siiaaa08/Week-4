package setinterfacetest.findsubsettest;

import org.junit.Test;
import setinterface.findsubset.SetOperation;


import java.util.Set;

import static org.junit.Assert.assertTrue;

public class SetOperationTest {
    @Test
    public void test(){
        Set<Integer> set1 = Set.of(2,4,6,9);
        Set<Integer> set2 = Set.of(4,6);
        assertTrue(SetOperation.isSubset(set2, set1));
    }
}
