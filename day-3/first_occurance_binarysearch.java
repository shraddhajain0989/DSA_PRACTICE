public class first_occurance_binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,6,8};
        int target = 4;
        int result = -1;
        int low = 0;
        int high = arr.length - 1;

        while(low<=high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == target) {
                result = mid;
                high = mid - 1; // Continue searching in the left half
            } else if(arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        System.out.println("First Occurrence: " + result);
    }
}