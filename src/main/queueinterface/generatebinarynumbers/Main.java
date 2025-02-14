package queueinterface.generatebinarynumbers;

import java.util.LinkedList;
import java.util.Queue;

import static queueinterface.generatebinarynumbers.BinaryFunction.binaryFunction;

public class Main {
        public static void main(String[] args) {
            Queue<String> q1=new LinkedList<>();
            int N=5;
            q1.add("1");
            Queue<String> q2=new LinkedList<>();
            binaryFunction(N,q1,q2);
            System.out.println(q2);

        }
    }


