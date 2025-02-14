package listinterface.rotateelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int rotateBy = 2;

        ListRotator<Integer> rotator = new ListRotator<>();
        rotator.rotate(numbers,rotateBy);
        System.out.println("Rotated List:" +numbers);
    }
}
