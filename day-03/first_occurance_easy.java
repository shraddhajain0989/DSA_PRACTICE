public class first_occurance_easy {
    public static void main(String[] args){
        int [] arr={3,3,4,4,6,8,10};
        int target=4;

        for (int j=0; j<arr.length; j++){
            if(arr[j]==target){
                System.out.println("Element Found at index "+j);
                break;

            } else if (arr[j] != target) {
                System.out.println("Element Not Found");
                break;
            }
        }
        
        }
    }

