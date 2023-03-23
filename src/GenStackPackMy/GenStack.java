package GenStackPackMy;

// Self Test 9, exercise 10. My version of code.
// A stack class for characters.
class GenStack<T> implements IGenStack<T> {
    private T[] q;  // this array holds the stack
    private int tos;  // the put and the get indices

    // Construct an empty Stack.
    GenStack(T[] aRef) {
        q = aRef; // allocate memory for stack
        if (q[0] != null) tos = q.length;
        else tos = 0;
    }

    // Construct a stack from stack
    GenStack(GenStack ob) {
        tos = ob.tos;
        q = (T[]) ob.q;
    }


    // Put a character into the queue.
    public void push(T ch) throws StackFullException {
        if(tos == q.length)
            throw new StackFullException(q.length);

        q[tos++] = ch;
    }

    // Get a character from the queue.
    public T pop() throws StackEmptyException {
        if(tos == 0)
            throw new StackEmptyException();
        tos--;
        return q[tos];
    }
}