public class second_largest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > max) {
                secondMax = max;
                max = num;
            } else if(num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if(secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondMax);
        }
    }
    
}
