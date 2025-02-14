package pipedstreams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
        public static void main(String[] args) {
            try {
                PipedOutputStream outputStream = new PipedOutputStream();
                PipedInputStream inputStream = new PipedInputStream(outputStream);

                WriterThread writer = new WriterThread(outputStream);
                ReaderThread reader = new ReaderThread(inputStream);

                writer.start();
                reader.start();

                writer.join();
                reader.join();

            } catch (Exception e) {
                System.out.println("Main Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


