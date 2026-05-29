public class palindrome {
    public static void main(String[] args) {
        String s = "nitin";
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
