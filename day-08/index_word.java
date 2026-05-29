public class index_word {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog";
        
        for(int i = 0; i < s1.length(); i++) {
            System.out.println("Index: " + i + ": " + s1.charAt(i));
        }
    }
}
