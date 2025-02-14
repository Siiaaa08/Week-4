package readlargefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogFilter {
        private String filePath;
        public ErrorLogFilter(String filePath) {
            this.filePath = filePath;
        }

        public void filterErrorLines() {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                int lineNumber = 1;

                System.out.println("Searching for 'error' in file...\n");

                while ((line = reader.readLine()) != null) {
                    if (line.toLowerCase().contains("error")) {
                        System.out.println("Line " + lineNumber + ": " + line);
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                System.out.println(" Error reading file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


