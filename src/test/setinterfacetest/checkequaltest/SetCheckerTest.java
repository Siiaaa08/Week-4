package setinterfacetest.checkequaltest;

import org.junit.Test;
import setinterface.checkequal.SetChecker;

import java.util.Set;

import static org.junit.Assert.assertTrue;

public class SetCheckerTest {
    @Test
    public void test(){
        SetChecker<Integer> checker = new SetChecker<>();
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,2,1);
        assertTrue(checker.areSetsEqual(set1,set2));

    }
}
