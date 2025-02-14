package countwords;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();

            WordCounter counter = new WordCounter(filePath);
            counter.countWords();

            scanner.close();
        }
    }


