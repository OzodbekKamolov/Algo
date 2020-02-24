import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MinimumConcat minCon = new MinimumConcat();
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(minCon.minimumConcat("abab", "bbb"));
        System.out.println("Fibonacci(" + 20 + ") = " + fibonacci.fibonacciMatrix(20));

    }


}
