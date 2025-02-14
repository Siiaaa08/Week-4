package queueinterface.stackusingqueue;

import java.util.Queue;

public class ReversFunctionForQueue {
        public static void reverseFunction(Queue<Integer> q1) {
            if (q1.isEmpty()) {
                return;
            }

            int front = q1.remove();

            reverseFunction(q1);

            q1.add(front);
        }
    }


