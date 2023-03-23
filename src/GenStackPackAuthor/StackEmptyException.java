package GenStackPackAuthor;

// An exception for stack-empty errors.
public class StackEmptyException extends Exception {

    public String toString() {
        return "\nGenStack is empty.";
    }
}
