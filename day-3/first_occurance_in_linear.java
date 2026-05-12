public class first_occurance_in_linear {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,30};
        int target = 30;

        int index = -1;

        for(int j = 0; j < arr.length; j++) {

            if(arr[j] == target) {
                index = j;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Element Found at index " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}