public class srting_equal_check {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1==s2: " + (s1 == s2)); // true, because of string literal pooling
        System.out.println("s1==s3: " + (s1 == s3)); // false, because s3 is a new object
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}
