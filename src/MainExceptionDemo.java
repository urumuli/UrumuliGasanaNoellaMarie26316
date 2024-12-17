public class MainExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Triggering IOException:");
        IOExceptionExample.triggerIOException();
        System.out.println("\nTriggering FileNotFoundException:");
        FileNotFoundExceptionExample.triggerFileNotFoundException();
        System.out.println("\nTriggering EOFException:");
        EOFExceptionExample.triggerEOFException();
        System.out.println("\nTriggering SQLException:");
        SQLExceptionExample.triggerSQLException();
        System.out.println("\nTriggering ClassNotFoundException:");
        ClassNotFoundExceptionExample.triggerClassNotFoundException();
        System.out.println("\nTriggering ArithmeticException:");
        ArithmeticExceptionExample.triggerArithmeticException();
        System.out.println("\nTriggering NullPointerException:");
        NullPointerExceptionExample.triggerNullPointerException();
        System.out.println("\nTriggering ArrayIndexOutOfBoundsException:");
        ArrayIndexOutOfBoundsExceptionExample.triggerArrayIndexOutOfBoundsException();
        System.out.println("\nTriggering ClassCastException:");
        ClassCastExceptionExample.triggerClassCastException();
        System.out.println("\nTriggering IllegalArgumentException:");
        IllegalArgumentExceptionExample.triggerIllegalArgumentException();
        System.out.println("\nTriggering NumberFormatException:");
        NumberFormatExceptionExample.triggerNumberFormatException();
    }
}
