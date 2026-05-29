public class concate {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String result1 = s1 + " " + s2; // Concatenation using + operator
        String result2 = s1.concat(" ").concat(s2); // Concatenation using concat() method
        System.out.println(result1); // Output: Hello World
        System.out.println(result2); // Output: Hello World 
    }
}
