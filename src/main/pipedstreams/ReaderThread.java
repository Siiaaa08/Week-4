package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread{
        private PipedInputStream inputStream;

        public ReaderThread(PipedInputStream inputStream) {
            this.inputStream = inputStream;
        }

        public void run() {
            try {
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);

                String message = new String(buffer, 0, bytesRead);
                System.out.println("Read: " + message);

                inputStream.close();
            } catch (IOException e) {
                System.out.println("Reader Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


