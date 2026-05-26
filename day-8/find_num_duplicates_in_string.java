public class find_num_duplicates_in_string {
    public static void main(String[] args) {
        String s = "programming";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = 0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
    }
}
