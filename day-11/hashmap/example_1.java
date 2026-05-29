import java.util.*;
public class example_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30); 
        System.out.println("Value for Apple: " + map.get("Apple")); // Output: 15
        System.out.println("Value for Banana: " + map.get("Banana")); // Output: 20
        System.out.println("Value for Orange: " + map.get("Orange")); // Output: 30
        System.out.println("Value for banana: " + map.containsKey("Banana")); 
        System.out.println("Value for banana: " + map.containsValue(20));
        System.out.println("Size of the map: " + map.size()); // Output: 3
        System.out.println("Is the map empty? " + map.isEmpty()); // Output: false
        map.remove("Apple");
        System.out.println("Size of the map after removal: " + map); // Output: 2
        map.clear();//after clearing the map no elements will be there in the map
        System.out.println("Size of the map after clearing: " + map.size()); // Output
    }
}