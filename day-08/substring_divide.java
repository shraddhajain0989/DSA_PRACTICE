public class substring_divide {
    public static void main(String[] args) {
        String str = "Java Programming language";
        String substring1 = str.substring(0, 5); // Extracts "Java "
        String substring2 = str.substring(5, 16); // Extracts "Programming"
        String substring3 = str.substring(16); // Extracts "language"

        System.out.println("Substring 1: " + substring1); // Output: Java
        System.out.println("Substring 2: " + substring2); // Output: Programming
        System.out.println("Substring 3: " + substring3); // Output: language
    }
}
