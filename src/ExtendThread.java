/*
    Try this 11-1
    Extend Thread.
 */

class MyThreadT extends Thread {

    // Construct a new thread.
    MyThreadT(String name) {
        super(name);  // name thread
    }

    public static MyThreadT createAndStart(String name) {
        MyThreadT myThrd = new MyThreadT(name);
        myThrd.start();
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(getName() + " staring.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + " count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

//        MyThreadT mt = new MyThreadT("Child #1");
//        mt.start();

        MyThreadT mt = MyThreadT.createAndStart("Child #1");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
