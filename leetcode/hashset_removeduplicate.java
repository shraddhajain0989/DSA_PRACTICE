package leetcode;

import java.util.HashSet;

public class hashset_removeduplicate {

    public static void main(String[] args) {

        int arr[] = {1,2,3,1,2,3};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(Integer num : set) {
            System.out.print(num + " ");
        }
    }
}