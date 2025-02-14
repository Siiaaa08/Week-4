package bytearraystream;

import java.io.File;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            String sourceImagePath = "D:/Sample/Day3W4/Streams/src/main/java/bytearraystream/Source.jpg";
            String outputImagePath = "output.jpg";

            byte[] imageBytes = ImageConverter.imageToByteArray(sourceImagePath);
            if (imageBytes != null) {
                System.out.println("Image converted to byte array successfully!");
                ImageConverter.byteArrayToImage(imageBytes, outputImagePath);

                if (verifyImages(sourceImagePath, outputImagePath)) {
                    System.out.println("Verification successful: Images are identical!");
                } else {
                    System.out.println("Verification failed: Images are different!");
                }
            }
        }

        private static boolean verifyImages(String img1, String img2) {
            try {
                File file1 = new File(img1);
                File file2 = new File(img2);

                if (file1.length() != file2.length()) {
                    return false;
                }

                byte[] file1Bytes = ImageConverter.imageToByteArray(img1);
                byte[] file2Bytes = ImageConverter.imageToByteArray(img2);

                return Arrays.equals(file1Bytes, file2Bytes);

            } catch (Exception e) {
                System.out.println(" Error during image verification.");
                e.printStackTrace();
                return false;
            }
        }
    }


