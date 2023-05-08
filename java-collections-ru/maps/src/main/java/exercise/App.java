package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map <String, Integer> map = new HashMap<>();
        if (!sentence.isEmpty()) {
            String[] words = sentence.split(" ");
            int count;
            for (var word : words) {
                count = 1;
                if (map.containsKey(word)) {
                    count = count + map.get(word);
                }
                map.put(word, count);
            }
        }
        return map;
    }

    public static String toString(Map map) {
        String glossary = "{";
        if (!map.isEmpty()) {
            var keys = map.keySet();
            for (var key : keys) {
                glossary = glossary + "\n  " + key + ": " + map.get(key);
            }
            glossary = glossary + "\n";
        }
        glossary = glossary + "}";

        return glossary;
    }
}
//END
