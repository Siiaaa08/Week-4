package listinterface.reverselist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original ArrayList:" + arrayList);
        ReverseArrayList<Integer> arrayReverse = new ReverseArrayList<>();
        arrayReverse.reverse(arrayList);
        System.out.println("Reversed ArrayList:"+arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original LinkedList:"+linkedList);
        ReverseLinkedList<Integer> ListReverse = new ReverseLinkedList<>();
        ListReverse.reverse(linkedList);
        System.out.println("Reversed LinkedList:"+linkedList);
    }
}
