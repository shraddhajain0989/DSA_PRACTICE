import java.util.Scanner;
public class mismatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Enter your age:");
                age = sc.nextInt();
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                sc.next(); // Clear the invalid input from the scanner buffer
            }
        }
        System.out.println("Your age is: " + age);
        sc.close();
    }
}
