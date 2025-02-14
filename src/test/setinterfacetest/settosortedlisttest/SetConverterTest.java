package setinterfacetest.settosortedlisttest;

import org.junit.Test;
import setinterface.settosortedlist.SetConverter;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SetConverterTest {
    @Test
    public void test(){
        Set<Integer> input = new HashSet<>(Arrays.asList(2,1,8,4,0));
        List<Integer> output = new ArrayList<>(Arrays.asList(0,1,2,4,8));
        assertEquals(output, SetConverter.convertToSortedList(input));
    }
}
