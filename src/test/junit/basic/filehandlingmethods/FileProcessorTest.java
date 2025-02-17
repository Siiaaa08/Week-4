package junit.basic.filehandlingmethods;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

    class FileProcessor {
        public static void writeToFile(String filename, String content) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(content);
            writer.close();
        }

        public static String readFromFile(String filename) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
            return content.toString();
        }
    }

    public class FileProcessorTest {

        private static final String TEST_FILE = "testfile.txt";
        @Test
        public void testWriteAndReadFromFile() throws IOException {
            String content = "Hello, this is a test!";
            FileProcessor.writeToFile(TEST_FILE, content);

            String readContent = FileProcessor.readFromFile(TEST_FILE);
            assertEquals(content, readContent, "File content does not match!");
        }
        @Test
        public void testFileExists() throws IOException {
            FileProcessor.writeToFile(TEST_FILE, "Test content");
            assertTrue(Files.exists(Paths.get(TEST_FILE)), "File does not exist!");
        }

        @Test
        public void testIOExceptionForMissingFile() {
            assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
        }
        @AfterEach
        public void cleanUp() throws IOException {
            Files.deleteIfExists(Paths.get(TEST_FILE));
        }
    }


