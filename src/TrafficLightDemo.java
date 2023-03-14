// Try this 12-1

// A simulation of a traffic light that uses
// an enumeration to describe the light's color.

// An enumeration of the colors for a traffic light.
enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    // Constructor.
    TrafficLightColor(int d) { delay = d;}

    // Method for getting delay time.
    int getDelay() {return delay;}

}

// A computerized traffic light.
class TrafficLightSimulation implements Runnable {
    private TrafficLightColor tlc;  // holds the traffic light color
    private boolean stop = false;  // set to true to stop the simulation
    private boolean changed = false;  // true when the light has changed
    private TrafficLightColor[] allColors = TrafficLightColor.values();
    private int count;

    TrafficLightSimulation(TrafficLightColor init) {
        tlc = init;
        count = tlc.ordinal();
    }

    TrafficLightSimulation() {
        tlc = TrafficLightColor.RED;
        count = tlc.ordinal();
    }

    // Start up the light.
    @Override
    public void run() {
        while (!stop) {
//            System.out.println("In run() method.");
            try {
                Thread.sleep(tlc.getDelay());
                } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Change color.
    synchronized void changeColor() {
/*
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                System.out.println(tlc.ordinal());
                tlc = TrafficLightColor.RED;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                System.out.println(tlc.ordinal());
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                System.out.println(tlc.ordinal());
        }
        */

        count++;
        if (count > allColors.length-1) count = 0;
        tlc = allColors[count];

        changed = true;
        notify();  // signal that the light has changed



    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
//        System.out.println("In waitForChange() method.");
        try {
            while (!changed){
//                System.out.println("In waitForChange() method: wait() activated.");
                wait();
            }
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Return current color
    synchronized TrafficLightColor getColor() {
//        System.out.println("In getColor() method.");
        return tlc;
    }

    // Stop the traffic light
    synchronized void cancel() {
//        System.out.println("In cancel() method.");
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulation t1 = new TrafficLightSimulation(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for(int i=0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
