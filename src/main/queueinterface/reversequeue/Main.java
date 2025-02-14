package queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(2);
        queue.offer(1);

        System.out.println("Original Queue:"+queue);
        System.out.println("Reversed Queue:"+QueueReverser.reverseQueue(queue));
    }
}
