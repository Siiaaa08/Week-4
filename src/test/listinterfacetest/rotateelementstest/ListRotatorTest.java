package listinterfacetest.rotateelementstest;

import listinterface.rotateelements.ListRotator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListRotatorTest {

        @Test
        public void test() {
            ListRotator<Integer> rotator = new ListRotator<>();

            List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
            List<Integer> expectedOutput = Arrays.asList(30, 40, 50, 10, 20);

            rotator.rotate(inputList, 2);

            assertEquals(expectedOutput, inputList, "List was not rotated correctly!");
        }
    }



