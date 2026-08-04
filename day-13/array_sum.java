//find out the subarray count whose sum is equal to given number
import java.util.Scanner;
public class array_sum{
public static void main(String args[]){
    int arr[] = {1,2,3,1,1,1,1,1};
    int k = 3;
    int count = 0;
    for(int i=0;i<arr.length;i++){
        int current_sum = 0;
        for(int j=i;j<arr.length;j++){
            current_sum += arr[j];
            if(current_sum == k ){
                count++;
            }
        }
    }
    System.out.println("Number of subarrays with k = " + k + " is  " + count);
}
}