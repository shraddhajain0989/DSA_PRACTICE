//jagged array return array which have more elements
import java.util.*;
public class jagged_array_more {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3,4,5},
            {6, 7} ,
            {8, 9,10}
        };

        int maxElements = 0;
        System.out.print("Sub-array with more elements: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].length > maxElements){
                maxElements = arr[i].length;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i].length == maxElements){
                for(int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
