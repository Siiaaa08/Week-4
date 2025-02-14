package queueinterfacetest.reversequeuetest;

import org.junit.Test;
import queueinterface.reversequeue.QueueReverser;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class QueueReverserTest {
    @Test
    public void test(){
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(4);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(9);
        queue1.offer(6);

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(6);
        queue2.offer(9);
        queue2.offer(3);
        queue2.offer(2);
        queue2.offer(4);

        assertEquals(queue2, QueueReverser.reverseQueue(queue1));
    }
}
