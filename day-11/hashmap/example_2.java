import java.util.HashMap;
public class example_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Rahul");
        map.put(102, "Priya");
        map.put(103, "Amit");
        map.put(104 , "Sneha");
        System.out.println("====Students Data using keySet() ====");
        for(Integer rollno : map.keySet()){
            System.out.println("Roll No: " + rollno);
        }
        System.out.println("====Students Data using values() ====");
        for(String name : map.values()){
            System.out.println("Name: " + name);
        } 
        System.out.println("====Students Data using entrySet() ====");
        for(HashMap.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        } 
        System.out.println("using iteration: ");  
        var iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }     
        }     
    }
}
