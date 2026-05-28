import java.util.Scanner;
public class number_format {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");// string input take karega
        String str = sc.nextLine(); // initalize
        try {
            int s = Integer.parseInt(str);
            System.out.println("The number is: " + s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}

