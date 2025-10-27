package basic_programming.methods;

public class ErrorMessage {
    // Opgave 2.1
    public void printErrorMessage() {
        System.out.println("An error has occurred!");
    }

    // Opgave 2.2
    public void printErrorMessage(int errorCode) {
        System.out.println("An error has occurred!.\nError code: " + errorCode);
    }

    // Opgave 2.3
    public void printErrorMessage(int errorCode, int lineNumber) {
        System.out.println("An error has occurred!.\nError code: " + errorCode + "\nLine number: " + lineNumber);
    }
}