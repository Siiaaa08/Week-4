package queueinterfacetest.stackusingqueuetest;

import org.junit.Assert;
import org.junit.Test;
import queueinterface.stackusingqueue.StackUsingQueue;

public class StackTest {
        @Test
        public void Tester(){
            StackUsingQueue stack=new StackUsingQueue();
            stack.push(5);
            stack.push(3);
            stack.push(2);
            Assert.assertEquals(2,stack.pop());
        }
    }


