
    import java.io.*;

    public class FileNotFoundExceptionExample {
        public static void triggerFileNotFoundException() {
            try {
                // Attempt to open a file that doesn’t exist
                FileInputStream file = new FileInputStream("missingfile.txt");
            } catch (FileNotFoundException e) {
                // Handle FileNotFoundException
                System.out.println("FileNotFoundException caught: " + e.getMessage());
            }
        }
    }

