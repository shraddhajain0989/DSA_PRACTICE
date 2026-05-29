public class replace {
    public static void main(String[] args) {
        String s = "Java is Java language";
        System.out.println("Original: '" + s + "'");
        System.out.println("replace: " + s.replace("Java", "Python"));
       System.out.println("change  only space :" + s.replace(" ", "_"));

    }
}
