import java.util.HashMap;
public class frequency_sir {
    public static void main(String[] args) {
            String senetence = "Apple  Banana Apple Orange Banana Grapes Banana";
            String[] words = senetence.split(" ");
            HashMap<String, Integer> Map = new HashMap<>();
            for (String word : words) {
                Map.put(word, Map.getOrDefault(word, 0) + 1);
            }
            System.out.println("word frequencies:");
            for (var entry : Map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            String mostFrequent= null;
            int maxCount = 0;
            for (var entry : Map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostFrequent = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            System.out.println("\nMost frequent word: " + mostFrequent + " (count: " + maxCount + ")");
    }
}
