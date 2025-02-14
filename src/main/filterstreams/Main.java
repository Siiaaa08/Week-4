package filterstreams;

public class Main {
        public static void main(String[] args) {
            String inputFile = "D:/Sample/Day3W4/Streams/src/main/java/filterstreams/input.txt";
            String outputFile = "output.txt";

            TextFileConverter converter = new TextFileConverter(inputFile, outputFile);
            converter.convertToLowercase();
        }
    }


