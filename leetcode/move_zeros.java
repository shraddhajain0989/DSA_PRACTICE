package leetcode;

public class move_zeros {

    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        int j = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                arr[j] = arr[i];
                j++;
            }
        }

        while(j < arr.length) {

            arr[j] = 0;
            j++;
        }

        // print array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}