package listinterfacetest.reverselisttest;

import listinterface.reverselist.ReverseArrayList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseArrayListTest {
        @Test
        public void test(){
            ReverseArrayList<Integer> reverser = new ReverseArrayList<>();

            List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            List<Integer> expectedOutput = Arrays.asList(5, 4, 3, 2, 1);

            reverser.reverse(inputList);

            assertEquals(expectedOutput, inputList);
        }
    }




