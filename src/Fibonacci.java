public class Fibonacci {
    public int fib(int n) {
        int minusTwo = 1, minusOne = 1, answer = 2;
        if (n < 3)
            return 1;
        for (n -= 3; n != 0; n--) {
            minusTwo = minusOne;
            minusOne = answer;
            answer = minusOne + minusTwo;
        }
        return answer;
    }

    int fibRec(int n) {

        if (n < 3) return 1;
        else return fibRec(n - 1) + fibRec(n - 2);
    }

    public int fibonacciMatrix(int x) {
        int[][] in = {
                {1, 1},
                {1, 0}};
        int[][] res = {{1, 0}, {0, 1}};

        String binary = Integer.toBinaryString(x);
        if (binary.charAt(binary.length() - 1) == '1') res = matrixMul(res, in);
        for (int i = binary.length() - 2; i > -1; i--) {
            in = matrixMul(in, in);
            if (binary.charAt(i) == '1')
                res = matrixMul(res, in);
        }

        return res[0][0];
    }

    // multiplication 2x2 matrix
    private static int[][] matrixMul(int[][] mx, int[][] mx2) {
        int a = mx[0][0] * mx2[0][0] + mx[0][1] * mx2[1][0];
        int b = mx[0][0] * mx2[0][1] + mx[0][1] * mx2[1][1];
        int c = mx[1][0] * mx2[0][0] + mx[1][1] * mx2[1][0];
        int d = mx[1][0] * mx2[0][1] + mx[1][1] * mx2[1][1];
        return new int[][]{{a, b}, {c, d}};
    }
}
