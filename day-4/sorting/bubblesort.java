package sorting;

public class bubblesort {
    public static void main(String[] args){

        int arr[] = {5,4,3,2,1};

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if(arr[j] < arr[i]){

                    // swapping
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // printing array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}