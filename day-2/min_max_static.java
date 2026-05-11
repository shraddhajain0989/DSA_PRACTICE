/*public class min_max_static {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        java.util.Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
*/

public class min_max_static {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}

//the abve 2 methods are same but the second one is more efficient as it only traverses the array once, while the first one sorts the array which takes O(n log n) time.