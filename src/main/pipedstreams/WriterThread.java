package pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread{
        private PipedOutputStream outputStream;

        public WriterThread(PipedOutputStream outputStream) {
            this.outputStream = outputStream;
        }

        public void run() {
            try {
                String message = "Hello from WriterThread!";
                System.out.println(" Writing: " + message);

                outputStream.write(message.getBytes());
                outputStream.close();
            } catch (IOException e) {
                System.out.println(" Writer Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


