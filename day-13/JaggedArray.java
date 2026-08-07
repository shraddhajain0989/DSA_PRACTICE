//jagged array 
import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
       //PREDEFINE SIZE OF ARRAY is below
       /*  int [][] arr = {
            {1, 2, 3,4,5},
            {6, 7} ,
            {8, 9,10}
        };
  */
 
        //userdefined size of array is below
        int [][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[3];

        //taking input from user
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the elements of jagged array: ");


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}