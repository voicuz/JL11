package GenStackPackMy;

public interface IGenStack<T> {
    // Put an item into stack.
    void push(T ch) throws StackFullException;

    // Get an item from stack.
    T pop() throws StackEmptyException;
}
