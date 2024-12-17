public class IllegalArgumentExceptionExample {
    public static void triggerIllegalArgumentException() {
        try {
            // Pass an invalid argument to a method
            Thread.sleep(-1000); // Sleep time cannot be negative
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }
}
