// fourth one i think
public class Fibonacci {

    // Method to find the nth Fibonacci number:
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }

    // Main method to test the function:
    public static void main(String[] args) {
        System.out.println("Fibonacci of 5: " + fib(5)); // Output: 5
    }
}
