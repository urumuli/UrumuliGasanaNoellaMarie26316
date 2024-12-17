
    import java.io.*;

    public class IOExceptionExample {
        public static void triggerIOException() {
            try {
                // Attempt to read a non-existent file
                BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
                reader.readLine();
            } catch (IOException e) {
                // Handle IOException
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    }

