public class NumberFormatExceptionExample {
    public static void triggerNumberFormatException() {
        try {
            // Attempt to convert a string to a number when the format is invalid
            int number = Integer.parseInt("NotANumber");
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
