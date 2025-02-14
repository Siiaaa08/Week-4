package listinterface.findnthelement;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFinder<T> {
        public T findNthFromEnd(LinkedList<T> list, int n) {
            if (list.isEmpty() || n <= 0) {
                throw new IllegalArgumentException("Invalid N or empty list");
            }

            ListIterator<T> fast = list.listIterator();
            ListIterator<T> slow = list.listIterator();


            for (int i = 0; i < n; i++) {
                if (!fast.hasNext()) {
                    throw new IllegalArgumentException("N is larger than list size");
                }
                fast.next();
            }

            while (fast.hasNext()) {
                fast.next();
                slow.next();
            }

            return slow.next();
        }
    }




