/*import java.util.HashMap;

public class char_frequency {
    public static void main(String[] args) {

        String word = "  programming  ";

        // remove spaces
        word = word.replace(" ", "");

        HashMap<Character, Integer> char_Frequency = new HashMap<>();

        for (char c : word.toCharArray()) {
            char_Frequency.put(c,
                    char_Frequency.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");

        for (HashMap.Entry<Character, Integer> entry : char_Frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

*/
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String str = "programming";

        // Convert string to char array
        char[] ch = str.toCharArray();

        // Create HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : ch) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Print frequency
        System.out.println("Character Frequencies:");

        for (char c : map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
    }
}