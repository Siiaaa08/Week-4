package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
        private String filePath;

        public WordCounter(String filePath) {
            this.filePath = filePath;
        }
        public void countWords() {
            Map<String, Integer> wordMap = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");

                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                        }
                    }
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                e.printStackTrace();
                return;
            }
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordMap.entrySet());
            sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            int totalWords = wordMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("\n Total Words in File: " + totalWords);

            System.out.println("\n🔝 Top 5 Most Frequent Words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                System.out.println("  " + sortedWords.get(i).getKey() + " → " + sortedWords.get(i).getValue() + " times");
            }
        }
    }


