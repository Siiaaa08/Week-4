package queueinterface.generatebinarynumbers;

import java.util.Queue;

public class BinaryFunction {
        public static void binaryFunction(int N, Queue<String> q1, Queue<String> q2){
            if(N==0){
                return;
            }
            String current=q1.poll();
            q2.add(current);
            q1.add(current+"0");
            q1.add(current+"1");

            binaryFunction(N-1,q1,q2);
        }
    }


