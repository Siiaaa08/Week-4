package listinterfacetest.reverselisttest;

import listinterface.reverselist.ReverseLinkedList;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {
        @Test
        public void test(){
            ReverseLinkedList<Integer> reverser = new ReverseLinkedList<>();

            LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
            LinkedList<Integer> expectedOutput = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

            reverser.reverse(inputList);

            assertEquals(expectedOutput, inputList);
        }
    }


