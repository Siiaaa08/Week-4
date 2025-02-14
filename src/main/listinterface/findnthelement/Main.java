package listinterface.findnthelement;

import java.util.LinkedList;

public class Main {
        public static void main(String[] args) {
            LinkedList<String> letters = new LinkedList<>();
            letters.add("A");
            letters.add("B");
            letters.add("C");
            letters.add("D");
            letters.add("E");

            int N = 2;

            System.out.println("Original List: " + letters);

            NthElementFinder<String> finder = new NthElementFinder<>();
            String result = finder.findNthFromEnd(letters, N);

            System.out.println(N + "th Element from the End: " + result);
        }
    }

