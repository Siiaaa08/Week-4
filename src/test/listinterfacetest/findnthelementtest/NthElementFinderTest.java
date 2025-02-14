package listinterfacetest.findnthelementtest;

import listinterface.findnthelement.NthElementFinder;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class NthElementFinderTest {
    @Test
    public void test(){
                NthElementFinder<String> finder = new NthElementFinder<>();

                LinkedList<String> inputList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
                assertEquals("D", finder.findNthFromEnd(inputList, 2));
            }
        }



