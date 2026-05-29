public class last_occurance_binary {

    public static void main(String[] args){

        int arr[] = {2,4,4,4,6,8};
        int target = 4;

        int low = 0;
        int high = arr.length - 1;

        int result = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] == target){

                result = mid;
                low = mid + 1;
            }

            else if(arr[mid] < target){

                low = mid + 1;
            }

            else{

                high = mid - 1;
            }
        }

        System.out.println("Last Occurrence at index " + result);
    }
}