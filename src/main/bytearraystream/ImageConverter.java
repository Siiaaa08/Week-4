package bytearraystream;

import java.io.*;

public class ImageConverter {
        private static final String SOURCE_IMAGE = "source.jpg";
        private static final String OUTPUT_IMAGE = "output.jpg";

        public static byte[] imageToByteArray(String imagePath) {
            try (FileInputStream fis = new FileInputStream(imagePath);
                 ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
                return bos.toByteArray();

            } catch (IOException e) {
                System.out.println(" Error converting image to byte array.");
                e.printStackTrace();
                return null;
            }
        }

        public static void byteArrayToImage(byte[] imageBytes, String outputPath) {
            try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputPath)) {

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                System.out.println("Image successfully written to: " + outputPath);

            } catch (IOException e) {
                System.out.println("Error writing byte array to image.");
                e.printStackTrace();
            }
        }
    }


