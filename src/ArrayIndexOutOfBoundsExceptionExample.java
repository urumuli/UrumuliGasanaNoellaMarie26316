public class ArrayIndexOutOfBoundsExceptionExample {
    public static void triggerArrayIndexOutOfBoundsException() {
        try {
            // Access an invalid array index
            int[] arr = new int[5];
            System.out.println(arr[10]); // Accessing index 10 which is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
