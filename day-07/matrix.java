public class matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 30},
                       {4, 5, 6},
                       {7, 8, 9}
        };

        int lar = arr[0][0];
        int secLar = arr[0][0];
        for(int i=0; i<arr.length; i++) {
            
            for(int j=0; j<arr[i].length;j++) {
                if(arr[i][j] > lar ) {
                    //secLar = arr[i][j];
                    lar = arr[i][j];
                }

                else if (arr[i][j] > secLar && arr[i][j] != lar ) {
                    secLar = arr[i][j];
                }
            }
            
        }
        System.out.println(secLar);
    }
}