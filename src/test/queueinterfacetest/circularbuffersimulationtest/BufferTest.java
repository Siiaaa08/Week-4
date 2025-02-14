package queueinterfacetest.circularbuffersimulationtest;

import org.junit.Assert;
import org.junit.Test;
import queueinterface.circularbuffersimulation.Buffer;

public class BufferTest {
        @Test
    public void Tester(){
        Buffer cb = new Buffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();

        cb.insert(5);
        cb.display();

        Assert.assertEquals(3,cb.peek());
    }
    }


