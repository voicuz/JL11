package GenQueue;

// A generic circular queue class.
class GenCircularQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc, loopCount;

    // Construct and empty queue with the given array.
    GenCircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue.
    public void put(T obj)
        throws QueueFullException {
        if((putloc==getloc & loopCount!=0) | (putloc==q.length & getloc==0))
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
        if(putloc==q.length) {
            putloc = 0;  // loop back.
            loopCount = 1;
        }
    }

    // Get a character from queue.
    public T get()
        throws QueueEmptyException {
        if(getloc==putloc & loopCount!=1)
            throw new QueueEmptyException();

        if(getloc==q.length-1) {
            getloc=0;  // loop back.
            loopCount = 0;
            return q[q.length-1];
        }
        return q[getloc++];
    }

}

