public class reverse_string {
    public static void main(String[] args) {
        String s = "java";
        System.out.println("Original: '" +s +"'");
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reverse: " +sb.reverse().toString());
    }
}
