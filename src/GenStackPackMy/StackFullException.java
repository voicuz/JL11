package GenStackPackMy;

// An exception for stack-full errors.
public class StackFullException extends Exception {
    int size;

    StackFullException(int s) { size = s; }

    public String toString() {
        return "\nGenStack is full. Maximum size is " + size;
    }
}