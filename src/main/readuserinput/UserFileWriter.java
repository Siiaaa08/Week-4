package readuserinput;

import java.io.FileWriter;
import java.io.IOException;

public class UserFileWriter {
        private static final String FILE_NAME = "user_info.txt";

        public static void saveUserToFile(User user) {
            try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // Append mode
                writer.write(user.toString());
                System.out.println("Data saved successfully in " + FILE_NAME);
            } catch (IOException e) {
                System.out.println("Error: Unable to save data.");
                e.printStackTrace();
            }
        }
    }


