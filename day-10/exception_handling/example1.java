import java.util.*;

public class example1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{

            // ArithmeticException
            System.out.println("Enter a intrger : ");
            int n = sc.nextInt();
            int[] arr = {1,2,3};

            // ArrayIndexOutOfBoundsException
            System.out.println("Enter an index : ");
            int index = sc.nextInt();
            int result = arr[index] / n;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Arithmetic Exception occurred" );
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Array Index Out Of Bounds Exception occurred");
        }
        catch (Exception e) {
            System.out.println(
                "General Exception occurred");
        }
        sc.close();
    }
}