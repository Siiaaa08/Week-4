package setinterface.settosortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> input = new HashSet<>(Arrays.asList(4,7,2,9,1));
        System.out.println("Original List -> "+input);
        System.out.println("Sorted List -> "+SetConverter.convertToSortedList(input));
    }
}
