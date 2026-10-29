package Basics_1;
import java.util.*;
public class oracle {

    public class SearchEngineIndex {
        public static void main(String[] args) {
            // The Inverted Index: Maps a "Word" -> to a Set of "Web Page URLs"
            Map<String, Set<String>> invertedIndex = new HashMap<>();

            // Simulating data collected by your Web Crawler
            String url1 = "https://oracle.com";
            String url2 = "https://github.com";

            // Step 1: Tokenize text and map words to URLs
            indexPage(invertedIndex, "learn java programming language", url1);
            indexPage(invertedIndex, "learn rust security system speed", url2);

            // Step 2: Test a search query instantly in O(1) time complexity
            String searchQuery = "java";
            System.out.println("Search Results for '" + searchQuery + "': " + invertedIndex.get(searchQuery));
        }

        private static void mapWordToUrl(Map<String, Set<String>> index, String word, String url) {
            // If the word isn't in our index yet, create a fresh list for it
            index.computeIfAbsent(word, k -> new HashSet<>()).add(url);
        }

        private static void indexPage(Map<String, Set<String>> index, String rawText, String url) {
            // Split the sentence into individual lowercase words
            String[] words = rawText.toLowerCase().split(" ");
            for (String word : words) {
                mapWordToUrl(index, word, url);
            }
        }
    }

}
