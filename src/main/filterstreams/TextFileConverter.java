package filterstreams;

import java.io.*;

public class TextFileConverter {
        private String inputFile;
        private String outputFile;

        public TextFileConverter(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        public void convertToLowercase() {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line.toLowerCase());
                    writer.newLine();
                }

                System.out.println("Conversion completed! Check " + outputFile);

            } catch (IOException e) {
                System.out.println(" Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


