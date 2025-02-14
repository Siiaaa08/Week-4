package queueinterface.reversequeue;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static <T>Queue<T> reverseQueue(Queue<T> queue){
        Stack<T> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        return queue;
    }
}
