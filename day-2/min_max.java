// this program finds the minimum and maximum element in an array of integers in dynamic way. The user is prompted to enter the size of the array and then the elements of the array. The program then sorts the array and prints the minimum and maximum elements.
import java.util.Scanner;
import java.util.Arrays;

public class min_max {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Minimum element: " + arr[0]);
        System.out.println("Maximum element: " + arr[n - 2]);
    }
}
