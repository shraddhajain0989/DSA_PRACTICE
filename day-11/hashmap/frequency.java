// check the number of elements that have 
import java.util.HashMap;
public class frequency{
    public static void main(String[] args) {
        HashMap<String, Integer> Map = new HashMap<>();
        String[] str = {"apple", "banana", "apple", "orange", "banana", "grapes","Banana"};
        
        for (String s : str) {
            Map.put(s, Map.getOrDefault(s, 0) + 1);
        }
            }
        }
        for (HashMap.Entry<String, Integer> entry : Map.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue());
        }
    }
}