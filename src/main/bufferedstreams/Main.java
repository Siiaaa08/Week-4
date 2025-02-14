package bufferedstreams;

import java.io.IOException;

public class Main {
        public static void main(String[] args) {
            String sourceFile = "D:/Sample/Day3W4/Streams/src/main/java/bufferedstreams/LargeText.txt";
            String destBuffered = "bufferedCopy.txt";
            String destUnbuffered = "unbufferedCopy.txt";

            try {
                long startTime = System.nanoTime();
                FileCopier.copyUsingBufferedStreams(sourceFile, destBuffered);
                long endTime = System.nanoTime();
                System.out.println("Buffered Stream Time: " + (endTime - startTime) / 1_000_000 + " ms");

                startTime = System.nanoTime();
                FileCopier.copyUsingUnbufferedStreams(sourceFile, destUnbuffered);
                endTime = System.nanoTime();
                System.out.println("Unbuffered Stream Time: " + (endTime - startTime) / 1_000_000 + " ms");

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


