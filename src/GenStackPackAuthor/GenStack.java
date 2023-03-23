package GenStackPackAuthor;

// Self Test 9, exercise 10. Author's version of code.
// A stack class for characters.
class GenStack<T> implements IGenStack<T> {
    private T[] stck;  // this array holds the stack
    private int tos;  // top of stack

    // Construct an empty stack.
    GenStack(T[] aRef) {
        stck = aRef; // allocate memory for stack
        tos = 0;
    }

    // Construct a stack from a stack
    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;

        try {
            if(stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        // Copy elements.
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Construct a stack with initial values.
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;

        for(int i=0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }


    // Put a character into the stack.
    public void push(T ch) throws StackFullException {
        if(tos == stck.length)
            throw new StackFullException(stck.length);

        stck[tos] = ch;
        tos++;
    }

    // Get a character from the stack.
    public T pop() throws StackEmptyException {
        if(tos == 0)
            throw new StackEmptyException();
        tos--;
        return stck[tos];
    }
}