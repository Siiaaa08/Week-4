package queueinterface.stackusingqueue;

public class Main {
        public static void main(String[] args) {
            StackUsingQueue stack=new StackUsingQueue();
            stack.push(5);
            stack.push(3);
            stack.push(2);
            System.out.println(stack.pop());
            System.out.println(stack.isEmptyQueue());
        }
    }


