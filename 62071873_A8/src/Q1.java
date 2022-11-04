public class Q1 {
    public static void main(String[] args) {
        int[][] m1 = { { 14, 11, 13, 12 },
                { 18, 15, 13, 13 },
                { 19, 16, 15, 17 } };

        int[][] m2 = { { 54, 53, 51, 52 },
                { 51, 59, 52, 56 },
                { 53, 54, 52, 58 } };

        System.out.println("First array:");
        displayArray(m1);

        System.out.println("Second array:");
        displayArray(m2);

        int[][] result = addMatrix(m1, m2);
        System.out.println("The addition of the above two arrays is: ");
        displayArray(result);
    }

    public static int[][] addMatrix(int[][] a, int[][] b) {
        if(a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("The two matrices must have the same dimensions");
        }

        int[][] result = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // write your methods code here.
    public static void displayArray(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++)
                System.out.print(m[r][c] + " ");
            System.out.println();
        }
    }
}