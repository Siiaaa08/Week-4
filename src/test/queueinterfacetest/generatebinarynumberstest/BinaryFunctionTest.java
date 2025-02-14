package queueinterfacetest.generatebinarynumberstest;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static queueinterface.generatebinarynumbers.BinaryFunction.binaryFunction;

public class BinaryFunctionTest {
        @Test
        public void Tester(){
            Queue<String> q1=new LinkedList<>();
            int N=5;
            q1.add("1");
            Queue<String> q2=new LinkedList<>();
            binaryFunction(N,q1,q2);
            Assert.assertEquals(5,q2.size());
        }
    }

