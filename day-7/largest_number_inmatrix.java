public class largest_number_inmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 30},
            {4, 15, 6},
            {7, 8, 9}
        };

        int largest = matrix[0][0]; // Initialize largest with the first element

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j]; // Update largest if current element is greater
                }
            }
        }

        System.out.println("Largest number in the matrix: " + largest);
    }
}
