
    import java.io.*;

    public class EOFExceptionExample {
        public static void triggerEOFException() {
            try {
                // Create a file and write a single byte
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("testfile.dat"));
                dos.writeByte(1);
                dos.close();

                // Now read beyond the content
                DataInputStream dis = new DataInputStream(new FileInputStream("testfile.dat"));
                dis.readByte(); // Read first byte
                dis.readByte(); // Attempt to read beyond the file's content
            } catch (EOFException e) {
                // Handle EOFException
                System.out.println("EOFException caught: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    }

