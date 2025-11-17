
public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 30; // Change this value to test different Fibonacci numbers

        // Recursive Fibonacci
        long startTime = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long endTime = System.nanoTime();
        System.out.println("Recursive Fibonacci(" + n + ") = " + recursiveResult);
        System.out.println("Recursive Time: " + (endTime - startTime) / 1e6 + " ms");

        // Iterative Fibonacci
        startTime = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        endTime = System.nanoTime();
        System.out.println("Iterative Fibonacci(" + n + ") = " + iterativeResult);
        System.out.println("Iterative Time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
