
    public class ClassCastExceptionExample {
        public static void triggerClassCastException() {
            try {
                // Demonstrate an invalid type cast
                Object x = new Object();
                System.out.println((String) x); // Trying to cast Integer to String
            } catch (ClassCastException e) {
                // Handle ClassCastException
                System.out.println("ClassCastException caught: " + e.getMessage());
            }
        }
    }

