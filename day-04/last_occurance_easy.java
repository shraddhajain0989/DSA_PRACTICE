public class last_occurance_easy {
    public static void main(String[]args){
        int arr[] = {2,4,4,4,6,8};
        int target = 4;

        for(int j = arr.length-1; j >= 0; j--){
            if(arr[j] == target){
                System.out.println("Element Found at index "+j);
                break;

            } else if (arr[j] < target) {
                System.out.println("Element Not Found");
                break;
            }
        }

        
    }
}
//not complete yet