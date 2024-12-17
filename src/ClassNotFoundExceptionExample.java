
    public class ClassNotFoundExceptionExample {
        public static void triggerClassNotFoundException() {
            try {
                // Attempt to load a class that doesn't exist
                Class.forName("com.nonexistent.ClassName");
            } catch (ClassNotFoundException e) {
                // Handle ClassNotFoundException
                System.out.println("ClassNotFoundException caught: " + e.getMessage());
            }
        }
    }

