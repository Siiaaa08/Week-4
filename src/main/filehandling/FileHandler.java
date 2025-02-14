package filehandling;

import java.io.*;

public class FileHandler {

        public static byte[] readFile(String sourcePath) throws IOException {
            File sourceFile = new File(sourcePath);

            if (!sourceFile.exists()) {
                throw new FileNotFoundException("Error: Source file does not exist!");
            }

            try (FileInputStream fis = new FileInputStream(sourceFile)) {
                return fis.readAllBytes();
            }
        }

        public static void writeFile(byte[] data, String destinationPath) throws IOException {
            File destFile = new File(destinationPath);
            if (!destFile.exists()) {
                destFile.createNewFile();
            }

            try (FileOutputStream fos = new FileOutputStream(destFile)) {
                fos.write(data);
            }
        }
    }


