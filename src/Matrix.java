public class Matrix {
    // printing all elements in m x n matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

    // printing array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    // rotating matrix 90 degree clockwise
    public static int[][] rotateMatrix(int[][] in) {
        int len = in.length;
        for (int i = 0; i < len; i++)
            for (int j = i; j < len; j++) {
                int temp = in[i][j];
                in[i][j] = in[j][i];
                in[j][i] = temp;
            }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = in[i][j];
                in[i][j] = in[i][len - 1 - j];
                in[i][len - 1 - j] = temp;
            }
        }
        return in;
    }


}
