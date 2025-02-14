package listinterfacetest.removeduplicatestest;

import listinterface.removeduplicates.DuplicateRemover;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

    public class DuplicateRemoverTest {
        @Test
        public void test() {
            DuplicateRemover<Integer> remover = new DuplicateRemover<>();
            List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
            List<Integer> output = Arrays.asList(3, 1, 2, 4);
            assertEquals(output, remover.removeDuplicates(input));
        }

    }


