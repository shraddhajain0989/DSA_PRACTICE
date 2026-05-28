import java.util.Scanner;
public class arithmetic_handling_example {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int num = sc.nextInt();
        System.out.println("Enter denominator:");
        int den = sc.nextInt();
        try {
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}
