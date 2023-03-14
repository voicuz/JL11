/*


// Use synchronise to control access.

class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;  // Reset sum.

        for(int i=0; i < nums.length; i++) {
            sum +=nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(100);  // allow task-switch.
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Construct a new thread.
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, int[] nums) {
        MyThread myThrd = new MyThread(name, nums);

        myThrd.thrd.start();  // start the thread.
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " staring.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}




// Use synchronized block to control access to SumArray.

class SumArray {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0;  // Reset sum.

        for(int i=0; i < nums.length; i++) {
            sum +=nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(100);  // allow task-switch.
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Construct a new thread.
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, int[] nums) {
        MyThread myThrd = new MyThread(name, nums);

        myThrd.thrd.start();  // start the thread.
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " staring.");

        // synchronise calls to sumArray()
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ended.");
    }
}




 */