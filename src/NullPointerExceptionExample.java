public class NullPointerExceptionExample {
    public static void triggerNullPointerException() {
        try {
            // Access a null reference
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
