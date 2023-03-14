
// Self Test 11-12. Adding synchronization to the Queue class to be safe for multithreaded use.


import com.sun.source.tree.IfTree;

// A synchronized queue class for integers.
class Queue {
    private int[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new int[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a integer into the queue
    void put(int num) {
        if(putloc == q.length) {
            putloc = 0;
        }
        q[putloc++] = num;
        System.out.println("Putting " + num + " for " + Thread.currentThread().getName());
    }

    //  get a integer from the queue
    int get() {
        if(getloc == q.length) {
            System.out.println(" - End of queue");
            getloc++;
            return 0;
        }
        System.out.print("Getting number for " + Thread.currentThread().getName());

        if(getloc < q.length) return q[getloc++];
        return 0;
    }
}

class MyThread implements Runnable{
    Thread thrd;
    static Queue qob = new Queue(50);
    int nr;

    // Construct a new thread.
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    // Entry point of thread.

    @Override
    public void run() {

        System.out.println(thrd.getName() + " starting.");

        synchronized (qob) {
            // put some numbers/letters into bigQ
            for (int i = 0; i < 26; i++)
                qob.put((0 + i));

            // retrieve and display the elements from bigQ
            System.out.println("Contents of queue: ");
            for (int i = 0; i < 26; i++) {
                nr = qob.get();
                if (nr >= 0) System.out.println(" " + nr + " ");
            }
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class SynchronizedQueue {
    public static void main(String[] args) {

        var mt1 = MyThread.createAndStart("Child #1");
        var mt2 = MyThread.createAndStart("Child #2");

        int var1;

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}



/*

// Demonstrate the queue class.
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(23);
        Queue smallQ = new Queue(4);
        int i, nr;

        System.out.println("Using bigQ to store the numbers.");
        // put some numbers/letters into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((0 + i));

        // retrieve and display the elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            nr = bigQ.get();
            if(nr >= 0) System.out.print(nr + " ");
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (5 - i));

            smallQ.put((5 -i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            nr = smallQ.get();

            if (nr != 0) System.out.print(nr);
        }
    }
}


 */