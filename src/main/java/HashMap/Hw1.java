package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hw1 {
    public static void main(String[] args) {
        String text = "яблоко яблока яблоко груша груши груша";
        Map<String, Integer> wordCount = countWords(text);
        System.out.println(wordCount);
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) { //если слово есть
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}