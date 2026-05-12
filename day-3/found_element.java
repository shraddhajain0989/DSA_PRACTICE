public class found_element {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                found = true;
                System.out.println("Element Found at index " + j);
                break;
            }
        }
        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}