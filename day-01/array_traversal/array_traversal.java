import java.util.Arrays;
public class array_traversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);// this will print each element on a new line
            System.out.print(arr[i] + " ");// this will print all elements on the same line separated by space
        }
    }
}