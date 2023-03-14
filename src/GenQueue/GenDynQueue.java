package GenQueue;

// A generic dynamic queue class
class GenDynQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc;
    private String str;

    // Construct an empty queue with the given array.
    GenDynQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(T obj)
        throws QueueFullException {
        if (putloc == q.length) {
            // increase queue size
//            String[] s = new String[q.length * 2];
            GenDynQueue[] t = new GenDynQueue[q.length*2];

            //copy elements into new queue.
            for(int i=0; i < q.length; i++) {
//                t[i] = q[i];

            }

            q = (T[]) t;
        }

        q[putloc++] = obj;
    }

    // Get a character from the queue.
    public T get()
        throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

//        q = Character.pars(t[getloc]);
//        T t = q[getloc++];

        return q[getloc++];
    }
}


