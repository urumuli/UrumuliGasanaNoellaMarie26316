public class ArithmeticExceptionExample {
    public static void triggerArithmeticException() {
        try {
            // Simulate an arithmetic operation that fails (division by zero)
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
