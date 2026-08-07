//return the common numbers which present in the subarray 
import java.util.Scanner;
public class jagged_array_commonnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
            {1, 2, 3,4,5},
            {2, 3,4,5},
            {3, 4,2,8},
            {2,3,8}
        };

        int[] common = new int[arr[0].length];
        for(int i=0; i<arr[0].length; i++){
            common[i] = arr[0][i];
        }

        for(int i=1; i<arr.length; i++){
            int[] temp = new int[arr[i].length];
            int k = 0;
            for(int j=0; j<arr[i].length; j++){
                for(int l=0; l<common.length; l++){
                    if(arr[i][j] == common[l]){
                        temp[k] = arr[i][j];
                        k++;
                    }
                }
            }
            common = new int[k];
            for(int m=0; m<k; m++){
                common[m] = temp[m];
            }
        }
        for(int i=0; i<common.length; i++){
            System.out.print(common[i] + " ");
        }
        System.out.println();

    }
}
