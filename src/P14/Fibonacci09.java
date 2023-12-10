package P14;

public class Fibonacci09 {
    public static void main(String[] args) {
        printFibonacci(12);
    }

    static int fibonacciRekursif(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciRekursif(n - 1) + fibonacciRekursif(n - 2);
        }
    }

    static void printFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Minggu ke-" + i + " = " + fibonacciRekursif(i));
        }
    }
}
