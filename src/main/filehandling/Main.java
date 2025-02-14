package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
        public static void main(String[] args) {
            String sourcePath = "D:/Sample/Day3W4/Streams/src/main/java/filehandling/Source.txt";
            String destinationPath = "copy.txt";

            try {
                byte[] fileData = FileHandler.readFile(sourcePath);
                FileHandler.writeFile(fileData, destinationPath);

                System.out.println("File successfully copied to " + destinationPath);
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


